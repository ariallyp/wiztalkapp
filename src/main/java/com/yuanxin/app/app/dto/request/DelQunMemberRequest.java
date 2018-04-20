package com.yuanxin.app.app.dto.request;

import java.util.ArrayList;
import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class DelQunMemberRequest extends Request {

	public String ChatRoomName;
	
	public List<Member> memberList;

	public void addMember(Member member) {
		if (this.memberList == null) {
			this.memberList = new ArrayList<Member>();
		}
		this.memberList.add(member);
	}
	
}
