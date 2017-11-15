
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
    "order_id",
    "amount",
    "kind",
    "gateway",
    "status",
    "message",
    "created_at",
    "test",
    "authorization",
    "currency",
    "location_id",
    "user_id",
    "parent_id",
    "device_id",
    "receipt",
    "error_code",
    "source_name"
})
public class Transaction {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("created_at")
    private Object createdAt;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("authorization")
    private Object authorization;
    @JsonProperty("currency")
    private Object currency;
    @JsonProperty("location_id")
    private Object locationId;
    @JsonProperty("user_id")
    private Object userId;
    @JsonProperty("parent_id")
    private Object parentId;
    @JsonProperty("device_id")
    private Object deviceId;
    @JsonProperty("receipt")
    private Receipt receipt;
    @JsonProperty("error_code")
    private Object errorCode;
    @JsonProperty("source_name")
    private String sourceName;
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

    public Transaction withId(Long id) {
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

    public Transaction withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Transaction withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Transaction withKind(String kind) {
        this.kind = kind;
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

    public Transaction withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    public Transaction withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public Object getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Transaction withCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
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

    public Transaction withTest(Boolean test) {
        this.test = test;
        return this;
    }

    /**
     * 
     * @return
     *     The authorization
     */
    @JsonProperty("authorization")
    public Object getAuthorization() {
        return authorization;
    }

    /**
     * 
     * @param authorization
     *     The authorization
     */
    @JsonProperty("authorization")
    public void setAuthorization(Object authorization) {
        this.authorization = authorization;
    }

    public Transaction withAuthorization(Object authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public Object getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    public Transaction withCurrency(Object currency) {
        this.currency = currency;
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

    public Transaction withLocationId(Object locationId) {
        this.locationId = locationId;
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

    public Transaction withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    @JsonProperty("parent_id")
    public Object getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parent_id
     */
    @JsonProperty("parent_id")
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Transaction withParentId(Object parentId) {
        this.parentId = parentId;
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

    public Transaction withDeviceId(Object deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 
     * @return
     *     The receipt
     */
    @JsonProperty("receipt")
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * 
     * @param receipt
     *     The receipt
     */
    @JsonProperty("receipt")
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Transaction withReceipt(Receipt receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * 
     * @return
     *     The errorCode
     */
    @JsonProperty("error_code")
    public Object getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The error_code
     */
    @JsonProperty("error_code")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public Transaction withErrorCode(Object errorCode) {
        this.errorCode = errorCode;
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

    public Transaction withSourceName(String sourceName) {
        this.sourceName = sourceName;
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

    public Transaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
