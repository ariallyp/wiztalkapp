package com.yuanxin.app.app.dto.request;

import com.yuanxin.app.app.dto.model.Member;

public class ChangeUserInfoRequest extends Request {
	
	public String uid;
	public String mobile;
	public String tel;
	public String email;
	public String password;
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
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String email) {
		this.password = email;
	}
}
