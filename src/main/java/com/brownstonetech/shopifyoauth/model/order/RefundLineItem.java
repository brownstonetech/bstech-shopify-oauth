
package com.brownstonetech.shopifyoauth.model.order;

import java.util.HashMap;
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
    "quantity",
    "line_item_id",
    "subtotal",
    "total_tax",
    "line_item"
})
public class RefundLineItem {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("quantity")
    private Long quantity;
    @JsonProperty("line_item_id")
    private Long lineItemId;
    @JsonProperty("subtotal")
    private Float subtotal;
    @JsonProperty("total_tax")
    private Float totalTax;
    @JsonProperty("line_item")
    private LineItem lineItem;
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

    public RefundLineItem withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public RefundLineItem withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 
     * @return
     *     The lineItemId
     */
    @JsonProperty("line_item_id")
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * 
     * @param lineItemId
     *     The line_item_id
     */
    @JsonProperty("line_item_id")
    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public RefundLineItem withLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     * 
     * @return
     *     The subtotal
     */
    @JsonProperty("subtotal")
    public Float getSubtotal() {
        return subtotal;
    }

    /**
     * 
     * @param subtotal
     *     The subtotal
     */
    @JsonProperty("subtotal")
    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public RefundLineItem withSubtotal(Float subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    /**
     * 
     * @return
     *     The totalTax
     */
    @JsonProperty("total_tax")
    public Float getTotalTax() {
        return totalTax;
    }

    /**
     * 
     * @param totalTax
     *     The total_tax
     */
    @JsonProperty("total_tax")
    public void setTotalTax(Float totalTax) {
        this.totalTax = totalTax;
    }

    public RefundLineItem withTotalTax(Float totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    /**
     * 
     * @return
     *     The lineItem
     */
    @JsonProperty("line_item")
    public LineItem getLineItem() {
        return lineItem;
    }

    /**
     * 
     * @param lineItem
     *     The line_item
     */
    @JsonProperty("line_item")
    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public RefundLineItem withLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
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

    public RefundLineItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
