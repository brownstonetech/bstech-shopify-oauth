package com.brownstonetech.shopifyoauth.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"webhooks"
})
public class WebhooksPayload {

	@JsonProperty("webhooks")
	private List<Webhook> webhooks = new ArrayList<Webhook>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 * The webhooks
	 */
	@JsonProperty("webhooks")
	public List<Webhook> getWebhooks() {
		return webhooks;
	}

	/**
	 * 
	 * @param webhooks
	 * The webhooks
	 */
	@JsonProperty("webhooks")
	public void setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
	}

	public WebhooksPayload withWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public WebhooksPayload withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}