package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;
import com.yuanxin.app.app.dto.model.QunInfo;


public class GetQunMembersResponse extends Response {

	private static final long serialVersionUID = -5560712119926962473L;

	public List<Member> memberList;
	
	public QunInfo quninfo;
	
}
