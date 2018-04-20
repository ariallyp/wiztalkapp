package com.yuanxin.app.app.wsdl.entity;

import java.io.Serializable;

public class SeUserOrganization implements Serializable {

	private String id;
	private String userId;
	private String organizationId;
	private boolean isActive;
	
	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public int getIsActive() {
		return isActive==true?0:1;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
