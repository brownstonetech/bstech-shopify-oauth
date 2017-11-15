
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
    "email",
    "accepts_marketing",
    "created_at",
    "updated_at",
    "first_name",
    "last_name",
    "orders_count",
    "state",
    "total_spent",
    "last_order_id",
    "note",
    "verified_email",
    "multipass_identifier",
    "tax_exempt",
    "tags",
    "last_order_name",
    "default_address"
})
public class Customer {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("accepts_marketing")
    private Boolean acceptsMarketing;
    @JsonProperty("created_at")
    private Object createdAt;
    @JsonProperty("updated_at")
    private Object updatedAt;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("orders_count")
    private Long ordersCount;
    @JsonProperty("state")
    private String state;
    @JsonProperty("total_spent")
    private String totalSpent;
    @JsonProperty("last_order_id")
    private Object lastOrderId;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("verified_email")
    private Boolean verifiedEmail;
    @JsonProperty("multipass_identifier")
    private Object multipassIdentifier;
    @JsonProperty("tax_exempt")
    private Boolean taxExempt;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("last_order_name")
    private Object lastOrderName;
    @JsonProperty("default_address")
    private DefaultAddress defaultAddress;
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

    public Customer withId(Long id) {
        this.id = id;
        return this;
    }

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

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The acceptsMarketing
     */
    @JsonProperty("accepts_marketing")
    public Boolean getAcceptsMarketing() {
        return acceptsMarketing;
    }

    /**
     * 
     * @param acceptsMarketing
     *     The accepts_marketing
     */
    @JsonProperty("accepts_marketing")
    public void setAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public Customer withAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
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

    public Customer withCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public Object getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Customer withUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 
     * @return
     *     The ordersCount
     */
    @JsonProperty("orders_count")
    public Long getOrdersCount() {
        return ordersCount;
    }

    /**
     * 
     * @param ordersCount
     *     The orders_count
     */
    @JsonProperty("orders_count")
    public void setOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Customer withOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Customer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * @return
     *     The totalSpent
     */
    @JsonProperty("total_spent")
    public String getTotalSpent() {
        return totalSpent;
    }

    /**
     * 
     * @param totalSpent
     *     The total_spent
     */
    @JsonProperty("total_spent")
    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Customer withTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    /**
     * 
     * @return
     *     The lastOrderId
     */
    @JsonProperty("last_order_id")
    public Object getLastOrderId() {
        return lastOrderId;
    }

    /**
     * 
     * @param lastOrderId
     *     The last_order_id
     */
    @JsonProperty("last_order_id")
    public void setLastOrderId(Object lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Customer withLastOrderId(Object lastOrderId) {
        this.lastOrderId = lastOrderId;
        return this;
    }

    /**
     * 
     * @return
     *     The note
     */
    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    public Customer withNote(Object note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The verifiedEmail
     */
    @JsonProperty("verified_email")
    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    /**
     * 
     * @param verifiedEmail
     *     The verified_email
     */
    @JsonProperty("verified_email")
    public void setVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public Customer withVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
        return this;
    }

    /**
     * 
     * @return
     *     The multipassIdentifier
     */
    @JsonProperty("multipass_identifier")
    public Object getMultipassIdentifier() {
        return multipassIdentifier;
    }

    /**
     * 
     * @param multipassIdentifier
     *     The multipass_identifier
     */
    @JsonProperty("multipass_identifier")
    public void setMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
    }

    public Customer withMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
        return this;
    }

    /**
     * 
     * @return
     *     The taxExempt
     */
    @JsonProperty("tax_exempt")
    public Boolean getTaxExempt() {
        return taxExempt;
    }

    /**
     * 
     * @param taxExempt
     *     The tax_exempt
     */
    @JsonProperty("tax_exempt")
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Customer withTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
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

    public Customer withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     * @return
     *     The lastOrderName
     */
    @JsonProperty("last_order_name")
    public Object getLastOrderName() {
        return lastOrderName;
    }

    /**
     * 
     * @param lastOrderName
     *     The last_order_name
     */
    @JsonProperty("last_order_name")
    public void setLastOrderName(Object lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public Customer withLastOrderName(Object lastOrderName) {
        this.lastOrderName = lastOrderName;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultAddress
     */
    @JsonProperty("default_address")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * 
     * @param defaultAddress
     *     The default_address
     */
    @JsonProperty("default_address")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Customer withDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
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

    public Customer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
