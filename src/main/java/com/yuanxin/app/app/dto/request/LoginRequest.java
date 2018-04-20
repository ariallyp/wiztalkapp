package com.yuanxin.app.app.dto.request;


public class LoginRequest extends Request {

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;
	
	private String apnsToken;
	
	//租户Id
	private String tenantId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getApnsToken() {
		return apnsToken;
	}

	public void setApnsToken(String apnsToken) {
		this.apnsToken = apnsToken;
	}

}
