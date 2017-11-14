
package com.brownstonetech.shopifyoauth.model;

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
    "webhook"
})
public class WebhookPayload {

    @JsonProperty("webhook")
    private Webhook webhook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The webhook
     */
    @JsonProperty("webhook")
    public Webhook getWebhook() {
        return webhook;
    }

    /**
     * 
     * @param webhook
     *     The webhook
     */
    @JsonProperty("webhook")
    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    public WebhookPayload withWebhook(Webhook webhook) {
        this.webhook = webhook;
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

    public WebhookPayload withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
