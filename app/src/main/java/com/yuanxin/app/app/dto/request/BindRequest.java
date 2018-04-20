package com.yuanxin.app.app.dto.request;

public class BindRequest extends Request {

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 绑定状态 -2 拒绝绑定 -1取消绑定 0申请绑定 1已绑定
	 */
	private String bindStatus;


	public String getBindStatus() {
		return bindStatus;
	}

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
