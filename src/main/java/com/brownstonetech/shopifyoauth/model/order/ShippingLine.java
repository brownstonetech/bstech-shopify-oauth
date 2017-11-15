
package com.brownstonetech.shopifyoauth.model.order;

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
    "id",
    "title",
    "price",
    "code",
    "source",
    "phone",
    "requested_fulfillment_service_id",
    "delivery_category",
    "carrier_identifier",
    "tax_lines"
})
public class ShippingLine {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("code")
    private Object code;
    @JsonProperty("source")
    private String source;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("requested_fulfillment_service_id")
    private Object requestedFulfillmentServiceId;
    @JsonProperty("delivery_category")
    private Object deliveryCategory;
    @JsonProperty("carrier_identifier")
    private Object carrierIdentifier;
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines = new ArrayList<TaxLine>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ShippingLine withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ShippingLine withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public ShippingLine withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Object getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Object code) {
        this.code = code;
    }

    public ShippingLine withCode(Object code) {
        this.code = code;
        return this;
    }

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public ShippingLine withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public ShippingLine withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 
     * @return
     *     The requestedFulfillmentServiceId
     */
    @JsonProperty("requested_fulfillment_service_id")
    public Object getRequestedFulfillmentServiceId() {
        return requestedFulfillmentServiceId;
    }

    /**
     * 
     * @param requestedFulfillmentServiceId
     *     The requested_fulfillment_service_id
     */
    @JsonProperty("requested_fulfillment_service_id")
    public void setRequestedFulfillmentServiceId(Object requestedFulfillmentServiceId) {
        this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
    }

    public ShippingLine withRequestedFulfillmentServiceId(Object requestedFulfillmentServiceId) {
        this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
        return this;
    }

    /**
     * 
     * @return
     *     The deliveryCategory
     */
    @JsonProperty("delivery_category")
    public Object getDeliveryCategory() {
        return deliveryCategory;
    }

    /**
     * 
     * @param deliveryCategory
     *     The delivery_category
     */
    @JsonProperty("delivery_category")
    public void setDeliveryCategory(Object deliveryCategory) {
        this.deliveryCategory = deliveryCategory;
    }

    public ShippingLine withDeliveryCategory(Object deliveryCategory) {
        this.deliveryCategory = deliveryCategory;
        return this;
    }

    /**
     * 
     * @return
     *     The carrierIdentifier
     */
    @JsonProperty("carrier_identifier")
    public Object getCarrierIdentifier() {
        return carrierIdentifier;
    }

    /**
     * 
     * @param carrierIdentifier
     *     The carrier_identifier
     */
    @JsonProperty("carrier_identifier")
    public void setCarrierIdentifier(Object carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
    }

    public ShippingLine withCarrierIdentifier(Object carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
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

    public ShippingLine withTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
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

    public ShippingLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
