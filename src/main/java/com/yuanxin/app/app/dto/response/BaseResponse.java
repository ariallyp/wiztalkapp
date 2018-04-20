package com.yuanxin.app.app.dto.response;

public class BaseResponse {
	private static final long serialVersionUID = 5629569037982738876L;

//	OK               = 0
//	NotFoundServer   = 1001
//	NotFound         = 65531
//	TooLong          = 65532
//	AuthErr          = 65533
//	ParamErr         = 65534
//	InternalErr      = 65535
	
	public static final int RET_SUCCESS = 0;
	public static final int RET_ERROR_TOKEN = 65533;
	public static final int RET_ERROR_PARAM = 65534;
	public static final int RET_ERROR = 65535;
	public static final int RET_ERROR_LOGIN = 65539;
	public static final int RET_ERROR_UNBIND = 65536;
	
	/**
	 * 返回码：0成功
	 */
	public Integer ret;

	/**
	 * （错误）信息
	 */
	public String errMsg;

	public Integer getRet() {
		return ret;
	}

	public void setRet(Integer ret) {
		this.ret = ret;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	

}
