
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
    "order_id",
    "created_at",
    "note",
    "restock",
    "user_id",
    "refund_line_items",
    "transactions",
    "order_adjustments"
})
public class ShopifyRefund {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("note")
    private String note;
    @JsonProperty("restock")
    private Boolean restock;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("refund_line_items")
    private List<RefundLineItem> refundLineItems = new ArrayList<RefundLineItem>();
    @JsonProperty("transactions")
    private List<Transaction> transactions = new ArrayList<Transaction>();
    @JsonProperty("order_adjustments")
    private List<Object> orderAdjustments = new ArrayList<Object>();
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

    public ShopifyRefund withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The orderId
     */
    @JsonProperty("order_id")
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId
     *     The order_id
     */
    @JsonProperty("order_id")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public ShopifyRefund withOrderId(Long orderId) {
        this.orderId = orderId;
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

    public ShopifyRefund withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public ShopifyRefund withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The restock
     */
    @JsonProperty("restock")
    public Boolean getRestock() {
        return restock;
    }

    /**
     * 
     * @param restock
     *     The restock
     */
    @JsonProperty("restock")
    public void setRestock(Boolean restock) {
        this.restock = restock;
    }

    public ShopifyRefund withRestock(Boolean restock) {
        this.restock = restock;
        return this;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public ShopifyRefund withUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 
     * @return
     *     The refundLineItems
     */
    @JsonProperty("refund_line_items")
    public List<RefundLineItem> getRefundLineItems() {
        return refundLineItems;
    }

    /**
     * 
     * @param refundLineItems
     *     The refund_line_items
     */
    @JsonProperty("refund_line_items")
    public void setRefundLineItems(List<RefundLineItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
    }

    public ShopifyRefund withRefundLineItems(List<RefundLineItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
        return this;
    }

    /**
     * 
     * @return
     *     The transactions
     */
    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * 
     * @param transactions
     *     The transactions
     */
    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ShopifyRefund withTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * 
     * @return
     *     The orderAdjustments
     */
    @JsonProperty("order_adjustments")
    public List<Object> getOrderAdjustments() {
        return orderAdjustments;
    }

    /**
     * 
     * @param orderAdjustments
     *     The order_adjustments
     */
    @JsonProperty("order_adjustments")
    public void setOrderAdjustments(List<Object> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
    }

    public ShopifyRefund withOrderAdjustments(List<Object> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
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

    public ShopifyRefund withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
