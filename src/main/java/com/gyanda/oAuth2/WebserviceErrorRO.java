package com.gyanda.oAuth2;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WebserviceErrorRO {
	private int errorCode;
    private String errorMessage;
    private boolean hasError;

    @JsonProperty("ErrorCode")
    public int getErrorCode()
    {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }

    @JsonProperty("ErrorMessage")
    public String getErrorMessage()
    {
        return errorMessage;
    }

    @JsonProperty("ErrorMessage")
    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("HasError")
    public boolean hasError()
    {
        return hasError;
    }

    @JsonProperty("HasError")
    public void setError(boolean hasError)
    {
        this.hasError = hasError;
    }

//    @JsonIgnore
//    public String getDescription()
//    {
//        return DefaultInternetWebserviceErrors.getDescription(getErrorCode());
//    }
}
