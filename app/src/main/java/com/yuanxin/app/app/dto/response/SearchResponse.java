package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class SearchResponse extends Response {

	private static final long serialVersionUID = -2369027069327315694L;

	public int count;

	public int memberListSize;

	public List<Member> memberList;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMemberListSize() {
		return memberListSize;
	}

	public void setMemberListSize(int memberListSize) {
		this.memberListSize = memberListSize;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	
}
