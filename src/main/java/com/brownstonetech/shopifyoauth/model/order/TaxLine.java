
package com.brownstonetech.shopifyoauth.model.order;

import java.math.BigDecimal;
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
    "title",
    "price",
    "rate"
})
public class TaxLine {

    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("rate")
    private Float rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public TaxLine withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TaxLine withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The rate
     */
    @JsonProperty("rate")
    public Float getRate() {
        return rate;
    }

    /**
     * 
     * @param rate
     *     The rate
     */
    @JsonProperty("rate")
    public void setRate(Float rate) {
        this.rate = rate;
    }

    public TaxLine withRate(Float rate) {
        this.rate = rate;
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

    public TaxLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
