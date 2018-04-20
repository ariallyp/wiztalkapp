package com.yuanxin.app.app.dto.request;

public class SetUserInfoRequest extends Request {

	public String mobile;
	public String tel;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
