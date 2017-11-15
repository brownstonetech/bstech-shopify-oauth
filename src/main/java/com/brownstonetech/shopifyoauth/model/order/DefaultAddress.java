
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
    "first_name",
    "last_name",
    "company",
    "address1",
    "address2",
    "city",
    "province",
    "country",
    "zip",
    "phone",
    "name",
    "province_code",
    "country_code",
    "country_name",
    "default"
})
public class DefaultAddress {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("first_name")
    private Object firstName;
    @JsonProperty("last_name")
    private Object lastName;
    @JsonProperty("company")
    private Object company;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private Object address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("province")
    private String province;
    @JsonProperty("country")
    private String country;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("name")
    private String name;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("default")
    private Boolean _default;
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

    public DefaultAddress withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public Object getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public DefaultAddress withFirstName(Object firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public Object getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public DefaultAddress withLastName(Object lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public Object getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    public DefaultAddress withCompany(Object company) {
        this.company = company;
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

    public DefaultAddress withAddress1(String address1) {
        this.address1 = address1;
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

    public DefaultAddress withAddress2(Object address2) {
        this.address2 = address2;
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

    public DefaultAddress withCity(String city) {
        this.city = city;
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

    public DefaultAddress withProvince(String province) {
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

    public DefaultAddress withCountry(String country) {
        this.country = country;
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

    public DefaultAddress withZip(String zip) {
        this.zip = zip;
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

    public DefaultAddress withPhone(String phone) {
        this.phone = phone;
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

    public DefaultAddress withName(String name) {
        this.name = name;
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

    public DefaultAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public DefaultAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The country_name
     */
    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public DefaultAddress withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * 
     * @return
     *     The _default
     */
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    /**
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public DefaultAddress withDefault(Boolean _default) {
        this._default = _default;
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

    public DefaultAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
