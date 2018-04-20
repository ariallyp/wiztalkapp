package com.yuanxin.app.app.dto.request;

public class BaseRequest {
	/**
	 * 用户唯一ID
	 */
	public String uid;

	/**
	 * 登录后的Token
	 */
	public String token;
	/**
	 * 设备唯一ID
	 */
	public String deviceID;
	
	/**
	 * 设备唯一ID
	 */
	public String deviceName;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * 设备类型
	 */
	public String deviceType = "android";

	/**
	 * 给服务单位自定义的ID（例如 4是富滇）
	 */
	public String customer_id;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	
	
	
}
