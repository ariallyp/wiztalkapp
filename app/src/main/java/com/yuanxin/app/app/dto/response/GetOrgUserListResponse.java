package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class GetOrgUserListResponse extends Response {

	private static final long serialVersionUID = 2676195480956844749L;

	public int memberCount;

	public List<Member> memberList;

}
