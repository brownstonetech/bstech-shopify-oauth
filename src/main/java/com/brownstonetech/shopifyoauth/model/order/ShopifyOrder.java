
package com.brownstonetech.shopifyoauth.model.order;

import java.math.BigDecimal;
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
	"shop_id",
    "id",
    "email",
    "closed_at",
    "created_at",
    "updated_at",
    "number",
    "note",
    "token",
    "gateway",
    "test",
    "total_price",
    "subtotal_price",
    "total_weight",
    "total_tax",
    "taxes_included",
    "currency",
    "financial_status",
    "confirmed",
    "total_discounts",
    "total_line_items_price",
    "cart_token",
    "buyer_accepts_marketing",
    "name",
    "referring_site",
    "landing_site",
    "cancelled_at",
    "cancel_reason",
    "total_price_usd",
    "checkout_token",
    "reference",
    "user_id",
    "location_id",
    "source_identifier",
    "source_url",
    "processed_at",
    "device_id",
    "browser_ip",
    "landing_site_ref",
    "order_number",
    "discount_codes",
    "note_attributes",
    "payment_gateway_names",
    "processing_method",
    "checkout_id",
    "source_name",
    "fulfillment_status",
    "tax_lines",
    "tags",
    "contact_email",
    "order_status_url",
    "line_items",
    "shipping_lines",
    "billing_address",
    "shipping_address",
    "fulfillments",
    "refunds",
    "customer"
})
public class ShopifyOrder {

//    @JsonProperty("shop_id")
//	private String shopId;
//    @JsonProperty("company_id")
//	private long companyId;
    @JsonProperty("id")
    private long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("number")
    private Long number;
    @JsonProperty("note")
    private String note;
    @JsonProperty("token")
    private String token;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("total_price")
    private BigDecimal totalPrice;
    @JsonProperty("subtotal_price")
    private BigDecimal subtotalPrice;
    @JsonProperty("total_weight")
    private BigDecimal totalWeight;
    @JsonProperty("total_tax")
    private BigDecimal totalTax;
    @JsonProperty("taxes_included")
    private boolean taxesIncluded;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("financial_status")
    private String financialStatus;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("total_discounts")
    private String totalDiscounts;
    @JsonProperty("total_line_items_price")
    private String totalLineItemsPrice;
    @JsonProperty("cart_token")
    private Object cartToken;
    @JsonProperty("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @JsonProperty("name")
    private String name;
    @JsonProperty("referring_site")
    private Object referringSite;
    @JsonProperty("landing_site")
    private Object landingSite;
    @JsonProperty("cancelled_at")
    private String cancelledAt;
    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("total_price_usd")
    private Object totalPriceUsd;
    @JsonProperty("checkout_token")
    private Object checkoutToken;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("user_id")
    private Object userId;
    @JsonProperty("location_id")
    private Object locationId;
    @JsonProperty("source_identifier")
    private Object sourceIdentifier;
    @JsonProperty("source_url")
    private Object sourceUrl;
    @JsonProperty("processed_at")
    private Object processedAt;
    @JsonProperty("device_id")
    private Object deviceId;
    @JsonProperty("browser_ip")
    private Object browserIp;
    @JsonProperty("landing_site_ref")
    private Object landingSiteRef;
    @JsonProperty("order_number")
    private Long orderNumber;
    @JsonProperty("discount_codes")
    private List<Object> discountCodes = new ArrayList<Object>();
    @JsonProperty("note_attributes")
    private List<NoteAttribute> noteAttributes = new ArrayList<NoteAttribute>();
    @JsonProperty("payment_gateway_names")
    private List<String> paymentGatewayNames = new ArrayList<String>();
    @JsonProperty("processing_method")
    private String processingMethod;
    @JsonProperty("checkout_id")
    private Object checkoutId;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines = new ArrayList<TaxLine>();
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("order_status_url")
    private Object orderStatusUrl;
    @JsonProperty("line_items")
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    @JsonProperty("shipping_lines")
    private List<ShippingLine> shippingLines = new ArrayList<ShippingLine>();
    @JsonProperty("billing_address")
    private BillingAddress billingAddress;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    @JsonProperty("fulfillments")
    private List<Object> fulfillments = new ArrayList<Object>();
    @JsonProperty("refunds")
    private List<Object> refunds = new ArrayList<Object>();
    @JsonProperty("customer")
    private Customer customer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//    /**
//     * 
//     * @return
//     *     The companyId
//     */
//    @JsonProperty("company_id")
//    public long getCompanyId() {
//        return companyId;
//    }

//    /**
//     * 
//     * @param companyId
//     *     The companyId
//     */
//    @JsonProperty("company_id")
//    public void setCompanyId(long companyId) {
//        this.companyId = companyId;
//    }

//    public ShopifyOrder withCompanyId(long companyId) {
//        this.companyId = companyId;
//        return this;
//    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public ShopifyOrder withId(Long id) {
        this.id = id;
        return this;
    }

//    /**
//     * 
//     * @return
//     *     The shop Id
//     */
//    @JsonProperty("shop_id")
//    public String getShopId() {
//        return shopId;
//    }
//
//    /**
//     * 
//     * @param shop Id
//     *     The shop Id
//     */
//    @JsonProperty("shop_id")
//    public void setShopId(String shopId) {
//        this.shopId = shopId;
//    }
//
//    public ShopifyOrder withShopId(String shopId) {
//        this.shopId = shopId;
//        return this;
//    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public ShopifyOrder withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The closedAt
     */
    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    /**
     * 
     * @param closedAt
     *     The closed_at
     */
    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public ShopifyOrder withClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShopifyOrder withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShopifyOrder withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The number
     */
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Long number) {
        this.number = number;
    }

    public ShopifyOrder withNumber(Long number) {
        this.number = number;
        return this;
    }

    /**
     * 
     * @return
     *     The note
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    public ShopifyOrder withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    public ShopifyOrder withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 
     * @return
     *     The gateway
     */
    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    /**
     * 
     * @param gateway
     *     The gateway
     */
    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public ShopifyOrder withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * 
     * @return
     *     The test
     */
    @JsonProperty("test")
    public Boolean getTest() {
        return test;
    }

    /**
     * 
     * @param test
     *     The test
     */
    @JsonProperty("test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    public ShopifyOrder withTest(Boolean test) {
        this.test = test;
        return this;
    }

    /**
     * 
     * @return
     *     The totalPrice
     */
    @JsonProperty("total_price")
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 
     * @param totalPrice
     *     The total_price
     */
    @JsonProperty("total_price")
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ShopifyOrder withTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The subtotalPrice
     */
    @JsonProperty("subtotal_price")
    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    /**
     * 
     * @param subtotalPrice
     *     The subtotal_price
     */
    @JsonProperty("subtotal_price")
    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public ShopifyOrder withSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The totalWeight
     */
    @JsonProperty("total_weight")
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * 
     * @param totalWeight
     *     The total_weight
     */
    @JsonProperty("total_weight")
    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public ShopifyOrder withTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * 
     * @return
     *     The totalTax
     */
    @JsonProperty("total_tax")
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * 
     * @param totalTax
     *     The total_tax
     */
    @JsonProperty("total_tax")
    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public ShopifyOrder withTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    /**
     * 
     * @return
     *     The taxesIncluded
     */
    @JsonProperty("taxes_included")
    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    /**
     * 
     * @param taxesIncluded
     *     The taxes_included
     */
    @JsonProperty("taxes_included")
    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public ShopifyOrder withTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
        return this;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ShopifyOrder withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 
     * @return
     *     The financialStatus
     */
    @JsonProperty("financial_status")
    public String getFinancialStatus() {
        return financialStatus;
    }

    /**
     * 
     * @param financialStatus
     *     The financial_status
     */
    @JsonProperty("financial_status")
    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public ShopifyOrder withFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }

    /**
     * 
     * @return
     *     The confirmed
     */
    @JsonProperty("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    /**
     * 
     * @param confirmed
     *     The confirmed
     */
    @JsonProperty("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public ShopifyOrder withConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    /**
     * 
     * @return
     *     The totalDiscounts
     */
    @JsonProperty("total_discounts")
    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    /**
     * 
     * @param totalDiscounts
     *     The total_discounts
     */
    @JsonProperty("total_discounts")
    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public ShopifyOrder withTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
        return this;
    }

    /**
     * 
     * @return
     *     The totalLineItemsPrice
     */
    @JsonProperty("total_line_items_price")
    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    /**
     * 
     * @param totalLineItemsPrice
     *     The total_line_items_price
     */
    @JsonProperty("total_line_items_price")
    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public ShopifyOrder withTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The cartToken
     */
    @JsonProperty("cart_token")
    public Object getCartToken() {
        return cartToken;
    }

    /**
     * 
     * @param cartToken
     *     The cart_token
     */
    @JsonProperty("cart_token")
    public void setCartToken(Object cartToken) {
        this.cartToken = cartToken;
    }

    public ShopifyOrder withCartToken(Object cartToken) {
        this.cartToken = cartToken;
        return this;
    }

    /**
     * 
     * @return
     *     The buyerAcceptsMarketing
     */
    @JsonProperty("buyer_accepts_marketing")
    public Boolean getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    /**
     * 
     * @param buyerAcceptsMarketing
     *     The buyer_accepts_marketing
     */
    @JsonProperty("buyer_accepts_marketing")
    public void setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public ShopifyOrder withBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ShopifyOrder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The referringSite
     */
    @JsonProperty("referring_site")
    public Object getReferringSite() {
        return referringSite;
    }

    /**
     * 
     * @param referringSite
     *     The referring_site
     */
    @JsonProperty("referring_site")
    public void setReferringSite(Object referringSite) {
        this.referringSite = referringSite;
    }

    public ShopifyOrder withReferringSite(Object referringSite) {
        this.referringSite = referringSite;
        return this;
    }

    /**
     * 
     * @return
     *     The landingSite
     */
    @JsonProperty("landing_site")
    public Object getLandingSite() {
        return landingSite;
    }

    /**
     * 
     * @param landingSite
     *     The landing_site
     */
    @JsonProperty("landing_site")
    public void setLandingSite(Object landingSite) {
        this.landingSite = landingSite;
    }

    public ShopifyOrder withLandingSite(Object landingSite) {
        this.landingSite = landingSite;
        return this;
    }

    /**
     * 
     * @return
     *     The cancelledAt
     */
    @JsonProperty("cancelled_at")
    public String getCancelledAt() {
        return cancelledAt;
    }

    /**
     * 
     * @param cancelledAt
     *     The cancelled_at
     */
    @JsonProperty("cancelled_at")
    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public ShopifyOrder withCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }

    /**
     * 
     * @return
     *     The cancelReason
     */
    @JsonProperty("cancel_reason")
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 
     * @param cancelReason
     *     The cancel_reason
     */
    @JsonProperty("cancel_reason")
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public ShopifyOrder withCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * 
     * @return
     *     The totalPriceUsd
     */
    @JsonProperty("total_price_usd")
    public Object getTotalPriceUsd() {
        return totalPriceUsd;
    }

    /**
     * 
     * @param totalPriceUsd
     *     The total_price_usd
     */
    @JsonProperty("total_price_usd")
    public void setTotalPriceUsd(Object totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public ShopifyOrder withTotalPriceUsd(Object totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
        return this;
    }

    /**
     * 
     * @return
     *     The checkoutToken
     */
    @JsonProperty("checkout_token")
    public Object getCheckoutToken() {
        return checkoutToken;
    }

    /**
     * 
     * @param checkoutToken
     *     The checkout_token
     */
    @JsonProperty("checkout_token")
    public void setCheckoutToken(Object checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public ShopifyOrder withCheckoutToken(Object checkoutToken) {
        this.checkoutToken = checkoutToken;
        return this;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public ShopifyOrder withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public Object getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public ShopifyOrder withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 
     * @return
     *     The locationId
     */
    @JsonProperty("location_id")
    public Object getLocationId() {
        return locationId;
    }

    /**
     * 
     * @param locationId
     *     The location_id
     */
    @JsonProperty("location_id")
    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    public ShopifyOrder withLocationId(Object locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceIdentifier
     */
    @JsonProperty("source_identifier")
    public Object getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * 
     * @param sourceIdentifier
     *     The source_identifier
     */
    @JsonProperty("source_identifier")
    public void setSourceIdentifier(Object sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public ShopifyOrder withSourceIdentifier(Object sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceUrl
     */
    @JsonProperty("source_url")
    public Object getSourceUrl() {
        return sourceUrl;
    }

    /**
     * 
     * @param sourceUrl
     *     The source_url
     */
    @JsonProperty("source_url")
    public void setSourceUrl(Object sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public ShopifyOrder withSourceUrl(Object sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The processedAt
     */
    @JsonProperty("processed_at")
    public Object getProcessedAt() {
        return processedAt;
    }

    /**
     * 
     * @param processedAt
     *     The processed_at
     */
    @JsonProperty("processed_at")
    public void setProcessedAt(Object processedAt) {
        this.processedAt = processedAt;
    }

    public ShopifyOrder withProcessedAt(Object processedAt) {
        this.processedAt = processedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The deviceId
     */
    @JsonProperty("device_id")
    public Object getDeviceId() {
        return deviceId;
    }

    /**
     * 
     * @param deviceId
     *     The device_id
     */
    @JsonProperty("device_id")
    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public ShopifyOrder withDeviceId(Object deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 
     * @return
     *     The browserIp
     */
    @JsonProperty("browser_ip")
    public Object getBrowserIp() {
        return browserIp;
    }

    /**
     * 
     * @param browserIp
     *     The browser_ip
     */
    @JsonProperty("browser_ip")
    public void setBrowserIp(Object browserIp) {
        this.browserIp = browserIp;
    }

    public ShopifyOrder withBrowserIp(Object browserIp) {
        this.browserIp = browserIp;
        return this;
    }

    /**
     * 
     * @return
     *     The landingSiteRef
     */
    @JsonProperty("landing_site_ref")
    public Object getLandingSiteRef() {
        return landingSiteRef;
    }

    /**
     * 
     * @param landingSiteRef
     *     The landing_site_ref
     */
    @JsonProperty("landing_site_ref")
    public void setLandingSiteRef(Object landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    public ShopifyOrder withLandingSiteRef(Object landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
        return this;
    }

    /**
     * 
     * @return
     *     The orderNumber
     */
    @JsonProperty("order_number")
    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * 
     * @param orderNumber
     *     The order_number
     */
    @JsonProperty("order_number")
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ShopifyOrder withOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The discountCodes
     */
    @JsonProperty("discount_codes")
    public List<Object> getDiscountCodes() {
        return discountCodes;
    }

    /**
     * 
     * @param discountCodes
     *     The discount_codes
     */
    @JsonProperty("discount_codes")
    public void setDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public ShopifyOrder withDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     * 
     * @return
     *     The noteAttributes
     */
    @JsonProperty("note_attributes")
    public List<NoteAttribute> getNoteAttributes() {
        return noteAttributes;
    }

    /**
     * 
     * @param noteAttributes
     *     The note_attributes
     */
    @JsonProperty("note_attributes")
    public void setNoteAttributes(List<NoteAttribute> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public ShopifyOrder withNoteAttributes(List<NoteAttribute> noteAttributes) {
        this.noteAttributes = noteAttributes;
        return this;
    }

    /**
     * 
     * @return
     *     The paymentGatewayNames
     */
    @JsonProperty("payment_gateway_names")
    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    /**
     * 
     * @param paymentGatewayNames
     *     The payment_gateway_names
     */
    @JsonProperty("payment_gateway_names")
    public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public ShopifyOrder withPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
        return this;
    }

    /**
     * 
     * @return
     *     The processingMethod
     */
    @JsonProperty("processing_method")
    public String getProcessingMethod() {
        return processingMethod;
    }

    /**
     * 
     * @param processingMethod
     *     The processing_method
     */
    @JsonProperty("processing_method")
    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public ShopifyOrder withProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
        return this;
    }

    /**
     * 
     * @return
     *     The checkoutId
     */
    @JsonProperty("checkout_id")
    public Object getCheckoutId() {
        return checkoutId;
    }

    /**
     * 
     * @param checkoutId
     *     The checkout_id
     */
    @JsonProperty("checkout_id")
    public void setCheckoutId(Object checkoutId) {
        this.checkoutId = checkoutId;
    }

    public ShopifyOrder withCheckoutId(Object checkoutId) {
        this.checkoutId = checkoutId;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceName
     */
    @JsonProperty("source_name")
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 
     * @param sourceName
     *     The source_name
     */
    @JsonProperty("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ShopifyOrder withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 
     * @return
     *     The fulfillmentStatus
     */
    @JsonProperty("fulfillment_status")
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    /**
     * 
     * @param fulfillmentStatus
     *     The fulfillment_status
     */
    @JsonProperty("fulfillment_status")
    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public ShopifyOrder withFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    /**
     * 
     * @return
     *     The taxLines
     */
    @JsonProperty("tax_lines")
    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    /**
     * 
     * @param taxLines
     *     The tax_lines
     */
    @JsonProperty("tax_lines")
    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public ShopifyOrder withTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
        return this;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public ShopifyOrder withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     * @return
     *     The contactEmail
     */
    @JsonProperty("contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * 
     * @param contactEmail
     *     The contact_email
     */
    @JsonProperty("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public ShopifyOrder withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * 
     * @return
     *     The orderStatusUrl
     */
    @JsonProperty("order_status_url")
    public Object getOrderStatusUrl() {
        return orderStatusUrl;
    }

    /**
     * 
     * @param orderStatusUrl
     *     The order_status_url
     */
    @JsonProperty("order_status_url")
    public void setOrderStatusUrl(Object orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public ShopifyOrder withOrderStatusUrl(Object orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The lineItems
     */
    @JsonProperty("line_items")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     * 
     * @param lineItems
     *     The line_items
     */
    @JsonProperty("line_items")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public ShopifyOrder withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     * 
     * @return
     *     The shippingLines
     */
    @JsonProperty("shipping_lines")
    public List<ShippingLine> getShippingLines() {
        return shippingLines;
    }

    /**
     * 
     * @param shippingLines
     *     The shipping_lines
     */
    @JsonProperty("shipping_lines")
    public void setShippingLines(List<ShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public ShopifyOrder withShippingLines(List<ShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
        return this;
    }

    /**
     * 
     * @return
     *     The billingAddress
     */
    @JsonProperty("billing_address")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * 
     * @param billingAddress
     *     The billing_address
     */
    @JsonProperty("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShopifyOrder withBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The shippingAddress
     */
    @JsonProperty("shipping_address")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 
     * @param shippingAddress
     *     The shipping_address
     */
    @JsonProperty("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShopifyOrder withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The fulfillments
     */
    @JsonProperty("fulfillments")
    public List<Object> getFulfillments() {
        return fulfillments;
    }

    /**
     * 
     * @param fulfillments
     *     The fulfillments
     */
    @JsonProperty("fulfillments")
    public void setFulfillments(List<Object> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public ShopifyOrder withFulfillments(List<Object> fulfillments) {
        this.fulfillments = fulfillments;
        return this;
    }

    /**
     * 
     * @return
     *     The refunds
     */
    @JsonProperty("refunds")
    public List<Object> getRefunds() {
        return refunds;
    }

    /**
     * 
     * @param refunds
     *     The refunds
     */
    @JsonProperty("refunds")
    public void setRefunds(List<Object> refunds) {
        this.refunds = refunds;
    }

    public ShopifyOrder withRefunds(List<Object> refunds) {
        this.refunds = refunds;
        return this;
    }

    /**
     * 
     * @return
     *     The customer
     */
    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShopifyOrder withCustomer(Customer customer) {
        this.customer = customer;
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

    public ShopifyOrder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
