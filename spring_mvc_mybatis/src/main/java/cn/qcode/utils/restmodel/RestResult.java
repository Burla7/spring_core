package cn.qcode.utils.restmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResult<T> {
	private T data;
	private RestError error;

	public RestResult() {
		this.error = new RestError("0", "success");
	}

	public RestResult setData(T data) {
		this.data = data;
		return this;
	}

	public T getData() {
		return data;
	}

	public RestResult setError(RestError error) {
		this.error = error;
		return this;
	}

	public RestError getError() {
		return error;
	}
}
