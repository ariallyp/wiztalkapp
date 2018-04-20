package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;
import com.yuanxin.app.app.dto.model.QunInfo;


public class DelQunMemberResponse extends Response {

	private static final long serialVersionUID = 5632693654978546765L;

	public List<Member> memberList;
	
	public QunInfo quninfo;
}
