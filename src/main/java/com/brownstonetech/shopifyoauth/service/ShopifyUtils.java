package com.brownstonetech.shopifyoauth.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.brownstonetech.shopifyoauth.model.OAuthParams;
import com.brownstonetech.shopifyoauth.model.Webhook;
import com.brownstonetech.shopifyoauth.model.WebhookPayload;
import com.brownstonetech.shopifyoauth.model.WebhooksPayload;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class ShopifyUtils {

	private static Logger _log = LoggerFactory.getLogger(ShopifyUtils.class);
	
	private OAuthParams oAuthParams;
//	private String redirectURL;

	public static final String SHOPIFY_SYSTEM_TYPE="shopify";

	private static final String SHOPIFY_DOMAIN_SUFFIX=".myshopify.com";
	
	private static final ObjectMapper objectMapper;
	
	static {
		
		objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, false);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.setAnnotationIntrospector(createJaxbJacksonAnnotationIntrospector());
		
		JavaTimeModule javaTimeModule=new JavaTimeModule();
		objectMapper.registerModule(javaTimeModule);

//		JsonOrgModule jsonOrgModule=new JsonOrgModule();
//		mapper.registerModule(jsonOrgModule);
		
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
	}
	
    private static AnnotationIntrospector createJaxbJacksonAnnotationIntrospector() {

//        final AnnotationIntrospector jaxbIntrospector = new JaxbAnnotationIntrospector(TypeFactory.defaultInstance());
        final AnnotationIntrospector jacksonIntrospector = new JacksonAnnotationIntrospector();

        // AnnotationIntrospector.pair(jacksonIntrospector, jaxbIntrospector);
        return jacksonIntrospector;
    }
    
    public ObjectMapper getObjectMapperInstance() {
    	return objectMapper;
    }
    
	public ShopifyUtils(OAuthParams oauthParams) {
//		this(redirectURL);
		this.oAuthParams = oauthParams;
	}
	
//	public ShopifyUtils(String redirectURL) {
//		this.redirectURL = redirectURL;
//	}
//	
//	protected String getRedirectURL() {
//		return redirectURL;
//	}

	public OAuthParams getOAuthParams() {
		return oAuthParams;
	}
	
	protected void setOAuthParams(OAuthParams oAuthParams) {
		this.oAuthParams = oAuthParams;
	}
	
	public ShopifyUtils(String shopifyShopName, String clientId, String clientSecret, String redirectURL) {
		oAuthParams = new OAuthParams();
		oAuthParams.setShopifyShopId(shopifyShopName);
		
		oAuthParams.setScope("read_products,read_customers,read_orders");

		String authzEndpoint = String.format("https://%s.myshopify.com/admin/oauth/authorize", shopifyShopName);
		oAuthParams.setAuthzEndpoint(authzEndpoint);

		String tokenEndpoint = String.format("https://%s.myshopify.com/admin/oauth/access_token", shopifyShopName);
		
		oAuthParams.setTokenEndpoint(tokenEndpoint);
		oAuthParams.setClientId(clientId);
		oAuthParams.setClientSecret(clientSecret);
		
		oAuthParams.setRedirectUri(redirectURL);
		oAuthParams.setState("");
		oAuthParams.setApplication("shopify");
	}

//	public String composeURL(String pathWithoutContext) {
//		StringBuilder sb = new StringBuilder(portalURL);
//		sb.append(portletContextName)
//		.append(pathWithoutContext);
//		return sb.toString();
//	}

	public long registerWebhook(String topic, String webhookURL, boolean force) throws ShopifyAPIException {
		RestTemplate restTemplate = new RestTemplate();
		String shopId = oAuthParams.getShopifyShopId();
		
		WebhookPayload request = new WebhookPayload().withWebhook(
				new Webhook()
					.withTopic(topic)
					.withAddress(webhookURL)
					.withFormat("json"));
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.add("X-Shopify-Access-Token", oAuthParams.getAccessToken());
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.setContentType(MediaType.APPLICATION_JSON);

			Map<String,String> criteria = new HashMap<String,String>(2);
			criteria.put("topic", topic);
			criteria.put("shopId", shopId);
			criteria.put("address", webhookURL);
			HttpEntity<String> queryEntity = new HttpEntity<String>(null, headers);
			_log.debug("Query webhook with criteria: {}", criteria);
			ResponseEntity<WebhooksPayload> response = restTemplate.exchange(
					"https://{shopId}.myshopify.com/admin/webhooks.json?topic={topic}&address={address}",
					HttpMethod.GET, queryEntity,
					WebhooksPayload.class, criteria);
			if ( response.getStatusCode().is2xxSuccessful() ) {
				WebhooksPayload queryResult = response.getBody();
				_log.debug("Query result: {}", objectMapper.writeValueAsString(queryResult));
				if ( queryResult != null && queryResult.getWebhooks() != null
						&& queryResult.getWebhooks().size() > 0) {
					if ( !force) {
						Webhook result = queryResult.getWebhooks().get(0);
						_log.debug("Webhook already registered, register ignored.");
						return result.getId();
					}
					// delete all existing hooks
					Iterator<Webhook> existingIter = queryResult.getWebhooks().iterator();
					while ( existingIter.hasNext() ) {
						Webhook existingHook = existingIter.next();
						Map<String,String> deleteCriteria = new HashMap<String,String>();
						deleteCriteria.put("hookId", String.valueOf(existingHook.getId()));
						deleteCriteria.put("shopId", shopId);
						ResponseEntity<String> deleteResponse = restTemplate.exchange(
								"https://{shopId}.myshopify.com/admin/webhooks/{hookId}.json",
								HttpMethod.DELETE, queryEntity, String.class,
								deleteCriteria);
						if ( deleteResponse.getStatusCode().is2xxSuccessful()) {
							_log.debug("Delete existing webhook success, webhookId={}", existingHook.getId());
						} else {
							_log.error("Delete existing webhook failed ({}), webhookId={}: {}", deleteResponse.getStatusCode(), existingHook.getId(), deleteResponse.getBody());
						}
					}
				}
			}
			
			String uri = String.format("https://%s.myshopify.com/admin/webhooks.json", shopId);
			HttpEntity<WebhookPayload> requestEntity = new HttpEntity<WebhookPayload>(request, headers);
			WebhookPayload result = restTemplate.postForObject( uri, requestEntity, WebhookPayload.class);
			_log.debug("Register webhook success: {}", objectMapper.writeValueAsString(result));
			return result.getWebhook().getId();
		} catch(HttpStatusCodeException e) {
			String body = e.getResponseBodyAsString();
			_log.error("Get error response {} {}, message body: {}",e.getStatusCode(), e.getStatusText(), body);
			throw new ShopifyAPIException("Failed to register Webhooks for store "+shopId+" topic: "+topic, e);
		} catch (RestClientException e) {
			_log.error("Register webook encounter RestClientException {}", e.getMessage());
			throw new ShopifyAPIException("Failed to registering Webhooks for store "+shopId+" topic: "+topic, e);
		} catch (JsonProcessingException e) {
			_log.error("Register webook encounter JsonProcessingException {}", e.getMessage());
			throw new ShopifyAPIException("Failed to registering Webhooks for store "+shopId+" topic: "+topic, e);
		}
	}

	public static String getShopIdFromDomain(String shopDomainName) throws ShopifyAPIException {
		shopDomainName = shopDomainName.toLowerCase();
		if ( ! shopDomainName.endsWith(ShopifyUtils.SHOPIFY_DOMAIN_SUFFIX)) {
			throw new ShopifyAPIException("Shop domain name is invalid: "+shopDomainName);
		}
		String shopifyShopId = shopDomainName.substring(0, 
				shopDomainName.length()-ShopifyUtils.SHOPIFY_DOMAIN_SUFFIX.length());
		return shopifyShopId;
	}

	public static byte[] hmacSHA256(String clientSecret, byte[] data)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
		String algorithm="HmacSHA256";
		Mac mac = Mac.getInstance(algorithm);
		byte[] clientSecretBytes = clientSecret.getBytes("UTF-8");
		mac.init(new SecretKeySpec(clientSecretBytes, algorithm));
		byte[] hmacResult = mac.doFinal(data);
		return hmacResult;
	}

	public static String base64Encode(byte[] data) {
		String hmac = Base64.encodeBase64String(data);
		return hmac;
	}
	
	public static String hexEncode(byte[] data) {
		return Hex.encodeHexString(data);
	}
	
}
