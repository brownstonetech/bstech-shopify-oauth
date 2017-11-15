
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
    "first_name",
    "address1",
    "phone",
    "city",
    "zip",
    "province",
    "country",
    "last_name",
    "address2",
    "company",
    "latitude",
    "longitude",
    "name",
    "country_code",
    "province_code"
})
public class ShippingAddress {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("province")
    private String province;
    @JsonProperty("country")
    private String country;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("address2")
    private Object address2;
    @JsonProperty("company")
    private String company;
    @JsonProperty("latitude")
    private Object latitude;
    @JsonProperty("longitude")
    private Object longitude;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ShippingAddress withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * 
     * @return
     *     The address1
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public ShippingAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShippingAddress withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public ShippingAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The zip
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The zip
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public ShippingAddress withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * 
     * @return
     *     The province
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * 
     * @param province
     *     The province
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public ShippingAddress withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public ShippingAddress withCountry(String country) {
        this.country = country;
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

    public ShippingAddress withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 
     * @return
     *     The address2
     */
    @JsonProperty("address2")
    public Object getAddress2() {
        return address2;
    }

    /**
     * 
     * @param address2
     *     The address2
     */
    @JsonProperty("address2")
    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public ShippingAddress withAddress2(Object address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public ShippingAddress withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Object getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public ShippingAddress withLatitude(Object latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Object getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public ShippingAddress withLongitude(Object longitude) {
        this.longitude = longitude;
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

    public ShippingAddress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ShippingAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The provinceCode
     */
    @JsonProperty("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 
     * @param provinceCode
     *     The province_code
     */
    @JsonProperty("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public ShippingAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public ShippingAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
