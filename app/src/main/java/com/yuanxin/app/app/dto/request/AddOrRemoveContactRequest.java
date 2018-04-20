package com.yuanxin.app.app.dto.request;



public class AddOrRemoveContactRequest extends Request {

	public String uid;
	
	public Integer starFriend;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getStarFriend() {
		return starFriend;
	}

	public void setStarFriend(Integer starFriend) {
		this.starFriend = starFriend;
	}
	
	
	
}
