package com.yuanxin.app.app.dto.response;

import java.io.Serializable;


public class Response implements Serializable {

	private static final long serialVersionUID = -8658023577124660186L;

	public BaseResponse baseResponse;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

}
