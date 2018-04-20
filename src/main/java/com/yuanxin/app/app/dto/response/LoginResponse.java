package com.yuanxin.app.app.dto.response;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.yuanxin.app.app.dto.model.Member;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class LoginResponse extends Response {

	private static final long serialVersionUID = -1333609560593757271L;

	/**
	 * 登录token
	 */
	public String token;

	public String uid;
	
	public Member member;


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
