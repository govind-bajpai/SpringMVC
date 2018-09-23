package com.gyanda.oAuth2;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SetProductSubscriptionResponse {
	
    private String messageId;
    private WebserviceErrorRO webserviceError;

    public String getMessageId()
    {
        return messageId;
    }

    @JsonProperty("MessageId")
    public void setMessageId(String messageId)
    {
        this.messageId = messageId;
    }

    public WebserviceErrorRO getWebserviceError()
    {
        return webserviceError;
    }

    @JsonProperty("WebserviceError")
    public void setWebserviceError(WebserviceErrorRO webserviceError)
    {
        this.webserviceError = webserviceError;
    }
}
