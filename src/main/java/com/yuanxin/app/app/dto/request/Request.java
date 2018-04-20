package com.yuanxin.app.app.dto.request;


//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public abstract class Request {

	public BaseRequest baseRequest;

	public BaseRequest getBaseRequest() {
		return baseRequest;
	}

	public void setBaseRequest(BaseRequest baseRequest) {
		this.baseRequest = baseRequest;
	}

	
}
