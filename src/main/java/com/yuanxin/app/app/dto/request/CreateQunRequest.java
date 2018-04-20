package com.yuanxin.app.app.dto.request;

import java.util.ArrayList;
import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class CreateQunRequest extends Request {

	// @JsonProperty(value = "creatorId")
	// public String CreatorId;

	public String topic;

	public int memberCount;

	public List<Member> memberList;

	public void addUid(String uid) {
		Member member = new Member();
		member.uid = uid;
		addMember(member);
	}
	
	public void addMember(Member member) {
		if (this.memberList == null) {
			this.memberList = new ArrayList<Member>();
		}
		this.memberList.add(member);
	}
	
	public void addMembers(List<Member> members) {
		if (this.memberList == null) {
			this.memberList = new ArrayList<Member>();
		}
		this.memberList.addAll(members);
	}
}
