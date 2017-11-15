
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
    "variant_id",
    "title",
    "quantity",
    "price",
    "grams",
    "sku",
    "variant_title",
    "vendor",
    "fulfillment_service",
    "product_id",
    "requires_shipping",
    "taxable",
    "gift_card",
    "name",
    "variant_inventory_management",
    "properties",
    "product_exists",
    "fulfillable_quantity",
    "total_discount",
    "fulfillment_status",
    "tax_lines"
})
public class LineItem {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("variant_id")
    private Object variantId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("quantity")
    private Long quantity;
    @JsonProperty("price")
    private String price;
    @JsonProperty("grams")
    private Long grams;
    @JsonProperty("sku")
    private Object sku;
    @JsonProperty("variant_title")
    private Object variantTitle;
    @JsonProperty("vendor")
    private Object vendor;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonProperty("taxable")
    private Boolean taxable;
    @JsonProperty("gift_card")
    private Boolean giftCard;
    @JsonProperty("name")
    private String name;
    @JsonProperty("variant_inventory_management")
    private Object variantInventoryManagement;
    @JsonProperty("properties")
    private List<Object> properties = new ArrayList<Object>();
    @JsonProperty("product_exists")
    private Boolean productExists;
    @JsonProperty("fulfillable_quantity")
    private Long fulfillableQuantity;
    @JsonProperty("total_discount")
    private String totalDiscount;
    @JsonProperty("fulfillment_status")
    private Object fulfillmentStatus;
    @JsonProperty("tax_lines")
    private List<Object> taxLines = new ArrayList<Object>();
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

    public LineItem withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The variantId
     */
    @JsonProperty("variant_id")
    public Object getVariantId() {
        return variantId;
    }

    /**
     * 
     * @param variantId
     *     The variant_id
     */
    @JsonProperty("variant_id")
    public void setVariantId(Object variantId) {
        this.variantId = variantId;
    }

    public LineItem withVariantId(Object variantId) {
        this.variantId = variantId;
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

    public LineItem withTitle(String title) {
        this.title = title;
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

    public LineItem withQuantity(Long quantity) {
        this.quantity = quantity;
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

    public LineItem withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The grams
     */
    @JsonProperty("grams")
    public Long getGrams() {
        return grams;
    }

    /**
     * 
     * @param grams
     *     The grams
     */
    @JsonProperty("grams")
    public void setGrams(Long grams) {
        this.grams = grams;
    }

    public LineItem withGrams(Long grams) {
        this.grams = grams;
        return this;
    }

    /**
     * 
     * @return
     *     The sku
     */
    @JsonProperty("sku")
    public Object getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    @JsonProperty("sku")
    public void setSku(Object sku) {
        this.sku = sku;
    }

    public LineItem withSku(Object sku) {
        this.sku = sku;
        return this;
    }

    /**
     * 
     * @return
     *     The variantTitle
     */
    @JsonProperty("variant_title")
    public Object getVariantTitle() {
        return variantTitle;
    }

    /**
     * 
     * @param variantTitle
     *     The variant_title
     */
    @JsonProperty("variant_title")
    public void setVariantTitle(Object variantTitle) {
        this.variantTitle = variantTitle;
    }

    public LineItem withVariantTitle(Object variantTitle) {
        this.variantTitle = variantTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The vendor
     */
    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    /**
     * 
     * @param vendor
     *     The vendor
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public LineItem withVendor(Object vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 
     * @return
     *     The fulfillmentService
     */
    @JsonProperty("fulfillment_service")
    public String getFulfillmentService() {
        return fulfillmentService;
    }

    /**
     * 
     * @param fulfillmentService
     *     The fulfillment_service
     */
    @JsonProperty("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public LineItem withFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
        return this;
    }

    /**
     * 
     * @return
     *     The productId
     */
    @JsonProperty("product_id")
    public Long getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    @JsonProperty("product_id")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public LineItem withProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 
     * @return
     *     The requiresShipping
     */
    @JsonProperty("requires_shipping")
    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    /**
     * 
     * @param requiresShipping
     *     The requires_shipping
     */
    @JsonProperty("requires_shipping")
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public LineItem withRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
        return this;
    }

    /**
     * 
     * @return
     *     The taxable
     */
    @JsonProperty("taxable")
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * 
     * @param taxable
     *     The taxable
     */
    @JsonProperty("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public LineItem withTaxable(Boolean taxable) {
        this.taxable = taxable;
        return this;
    }

    /**
     * 
     * @return
     *     The giftCard
     */
    @JsonProperty("gift_card")
    public Boolean getGiftCard() {
        return giftCard;
    }

    /**
     * 
     * @param giftCard
     *     The gift_card
     */
    @JsonProperty("gift_card")
    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public LineItem withGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
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

    public LineItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The variantInventoryManagement
     */
    @JsonProperty("variant_inventory_management")
    public Object getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    /**
     * 
     * @param variantInventoryManagement
     *     The variant_inventory_management
     */
    @JsonProperty("variant_inventory_management")
    public void setVariantInventoryManagement(Object variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
    }

    public LineItem withVariantInventoryManagement(Object variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
        return this;
    }

    /**
     * 
     * @return
     *     The properties
     */
    @JsonProperty("properties")
    public List<Object> getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties
     *     The properties
     */
    @JsonProperty("properties")
    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    public LineItem withProperties(List<Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 
     * @return
     *     The productExists
     */
    @JsonProperty("product_exists")
    public Boolean getProductExists() {
        return productExists;
    }

    /**
     * 
     * @param productExists
     *     The product_exists
     */
    @JsonProperty("product_exists")
    public void setProductExists(Boolean productExists) {
        this.productExists = productExists;
    }

    public LineItem withProductExists(Boolean productExists) {
        this.productExists = productExists;
        return this;
    }

    /**
     * 
     * @return
     *     The fulfillableQuantity
     */
    @JsonProperty("fulfillable_quantity")
    public Long getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    /**
     * 
     * @param fulfillableQuantity
     *     The fulfillable_quantity
     */
    @JsonProperty("fulfillable_quantity")
    public void setFulfillableQuantity(Long fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public LineItem withFulfillableQuantity(Long fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The totalDiscount
     */
    @JsonProperty("total_discount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * 
     * @param totalDiscount
     *     The total_discount
     */
    @JsonProperty("total_discount")
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public LineItem withTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }

    /**
     * 
     * @return
     *     The fulfillmentStatus
     */
    @JsonProperty("fulfillment_status")
    public Object getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    /**
     * 
     * @param fulfillmentStatus
     *     The fulfillment_status
     */
    @JsonProperty("fulfillment_status")
    public void setFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public LineItem withFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    /**
     * 
     * @return
     *     The taxLines
     */
    @JsonProperty("tax_lines")
    public List<Object> getTaxLines() {
        return taxLines;
    }

    /**
     * 
     * @param taxLines
     *     The tax_lines
     */
    @JsonProperty("tax_lines")
    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    public LineItem withTaxLines(List<Object> taxLines) {
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

    public LineItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
