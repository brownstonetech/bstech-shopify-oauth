
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
    "id",
    "address",
    "topic",
    "created_at",
    "updated_at",
    "format",
    "fields",
    "metafield_namespaces"
})
public class Webhook {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("address")
    private String address;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("format")
    private String format;
    @JsonProperty("fields")
    private List<Object> fields = new ArrayList<Object>();
    @JsonProperty("metafield_namespaces")
    private List<Object> metafieldNamespaces = new ArrayList<Object>();
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

    public Webhook withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Webhook withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The topic
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * 
     * @param topic
     *     The topic
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Webhook withTopic(String topic) {
        this.topic = topic;
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

    public Webhook withCreatedAt(String createdAt) {
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

    public Webhook withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Webhook withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 
     * @return
     *     The fields
     */
    @JsonProperty("fields")
    public List<Object> getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    @JsonProperty("fields")
    public void setFields(List<Object> fields) {
        this.fields = fields;
    }

    public Webhook withFields(List<Object> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 
     * @return
     *     The metafieldNamespaces
     */
    @JsonProperty("metafield_namespaces")
    public List<Object> getMetafieldNamespaces() {
        return metafieldNamespaces;
    }

    /**
     * 
     * @param metafieldNamespaces
     *     The metafield_namespaces
     */
    @JsonProperty("metafield_namespaces")
    public void setMetafieldNamespaces(List<Object> metafieldNamespaces) {
        this.metafieldNamespaces = metafieldNamespaces;
    }

    public Webhook withMetafieldNamespaces(List<Object> metafieldNamespaces) {
        this.metafieldNamespaces = metafieldNamespaces;
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

    public Webhook withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
