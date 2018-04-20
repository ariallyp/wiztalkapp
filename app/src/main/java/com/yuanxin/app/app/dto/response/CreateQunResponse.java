package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;


public class CreateQunResponse extends Response {

	public static final long serialVersionUID = -1905946076282832331L;

	public String ChatRoomName;

	public String topic;

	public int memberCount;

	public List<Member> memberList;

}
