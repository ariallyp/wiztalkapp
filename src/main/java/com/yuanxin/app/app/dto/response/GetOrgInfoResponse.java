package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class GetOrgInfoResponse extends Response {

	private static final long serialVersionUID = 947822122738833535L;

	public Member ognizationMemberList;

	public String userOgnization;

	public int starMemberCount;
	
	public List<Member> starMemberList;

}
