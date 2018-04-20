package com.yuanxin.app.app.wsdl.entity;

import java.io.Serializable;
import java.util.Date;

public class SeUser implements Serializable {
	
	@Override
	public String toString() {
		return "SeUser [id=" + id + ", name=" + name + ", password=" + password
				+ ", trueName=" + trueName + ", email=" + email
				+ ", windowsUsername=" + windowsUsername + ", thirtPartyName="
				+ thirtPartyName + ", seqNo=" + seqNo + ", isDeleted="
				+ isDeleted + ", creater=" + creater + ", createDate="
				+ createDate + ", modifyPerson=" + modifyPerson
				+ ", modifyDate=" + modifyDate + ", headImg=" + headImg
				+ ", uKey=" + uKey + "]";
	}

	private String id;
	private String name;
	private String password;
	private String trueName;
	private String email;
	private String windowsUsername;
	private String thirtPartyName;
	private Integer seqNo;
	private boolean isDeleted;
	private String creater;
	private String createDate;
	private String modifyPerson;
	private String modifyDate;
	private String headImg;
	private String uKey;
	
	private static final long serialVersionUID = 1L;

	public String getuKey() {
		return uKey;
	}

	public void setuKey(String uKey) {
		this.uKey = uKey;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? "" : email.trim();
	}

	public String getWindowsUsername() {
		return windowsUsername;
	}

	public void setWindowsUsername(String windowsUsername) {
		this.windowsUsername = windowsUsername == null ? null : windowsUsername.trim();
	}

	public String getThirtPartyName() {
		return thirtPartyName;
	}

	public void setThirtPartyName(String thirtPartyName) {
		this.thirtPartyName = thirtPartyName == null ? null : thirtPartyName.trim();
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public boolean getIsDeleted() {
		return isDeleted ;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater == null ? null : creater.trim();
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifyPerson() {
		return modifyPerson;
	}

	public void setModifyPerson(String modifyPerson) {
		this.modifyPerson = modifyPerson == null ? null : modifyPerson.trim();
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
