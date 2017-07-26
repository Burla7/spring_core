package cn.qcode.utils.restmodel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class RestException extends RuntimeException
{

    /**
     * @since Ver 1.1
     */

    private static final long serialVersionUID = -3996792579363348529L;

    private String errorCode;
    private String errorInfo;


    public RestException()
    {
        super();
    }

    public RestException(String errorCode, String errorInfo)
    {
        super(errorInfo);
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    public RestException(RestError restError)
    {
        super(restError.getErrorInfo());
        this.errorCode = restError.getErrorCode();
        this.errorInfo = restError.getErrorInfo();
    }


    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorInfo()
    {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo)
    {
        this.errorInfo = errorInfo;
    }


}
