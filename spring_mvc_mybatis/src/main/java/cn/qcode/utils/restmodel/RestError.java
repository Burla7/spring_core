package cn.qcode.utils.restmodel;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({"request", "errorCode", "errorInfo"})
public class RestError
{
/*    @JsonView(OrderView.OrderList.class)*/
    private String errorCode;
  /*  @JsonView(OrderView.OrderList.class)*/
    private String errorInfo;

    public RestError()
    {
        this.errorCode = "ERR_NOT_ERROR";
    }

    public RestError(String errorCode, String errorInfo)
    {
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    public RestError(RestException ex)
    {
        this.errorCode = ex.getErrorCode();
        this.errorInfo = ex.getErrorInfo();

    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer("JsonRestError[");
        sb.append(",errorCode=").append(errorCode);
        sb.append(",errorInfo=").append(errorInfo);
        sb.append("]");
        return sb.toString();
    }


    public String getErrorCode()
    {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public RestError setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorInfo()
    {
        return errorInfo;
    }

    @JsonProperty("errorInfo")
    public RestError setErrorInfo(String errorInfo)
    {
        this.errorInfo = errorInfo;
        return this;
    }

}
