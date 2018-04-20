package com.yuanxin.app.app.dto.model;

import java.io.Serializable;
import java.util.List;

/**
 * 联系人信息<br/>
 * 群信息<br/>
 * 群成员（联系人）信息<br/>
 * 
 * @author liuxue
 *
 */
public class Member implements Serializable {

	private static final long serialVersionUID = -601306827832038996L;

	public static final String SUFFIX_TENANT = "@tenant";
	public static final String SUFFIX_USER = "@user";
	public static final String SUFFIX_ORG = "@org";
	public static final String SUFFIX_QUN = "@qun";
	public static final String SUFFIX_APP = "@app";


	/**
	 * 用户唯一ID
	 */
	public String uid;

	/**
	 * 用户名
	 */
	public String userName;

	/**
	 * 昵称
	 */
	public String nickName;

	public String name;
	
	public String displayName;
	
	/**
	 * 头像地址
	 */
	public String headImgUrl;

	/**
	 * 子成员总数（暂时只有群聊信息有子成员）
	 */
	public int memberCount;

	/**
	 * 子成员列表（暂时只有群聊信息有子成员）
	 */
	public List<Member> memberList;


	/**
	 * NickName汉子拼音首字母与英文<br/>
	 * 如：张涵han，为ZHHAN
	 */
	public String pYInitial;

	/**
	 * NickName汉子拼音与英文<br/>
	 * 如：张涵han，为zhanghanhan
	 */
	public String pYQuanPin;



	public int status;

	public String password;
	
	/**
	 * 是否加星
	 */
	public int starFriend;
	/**
	 * email
	 */
	public String email;
	
	/**
	 * mobile
	 */
	public String mobile;

	public int sort;
	
	public String orgName;
	
	public String tel;

	public String description;
	
	public String avatar;
	
	public String follow;
	
	private String tenantId;
	
	private String weixin;
	
	private String qq;
	
	private String birthday;
	
	private String level;
	
	private String role;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public String getpYInitial() {
		return pYInitial;
	}

	public void setpYInitial(String pYInitial) {
		this.pYInitial = pYInitial;
	}

	public String getpYQuanPin() {
		return pYQuanPin;
	}

	public void setpYQuanPin(String pYQuanPin) {
		this.pYQuanPin = pYQuanPin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStarFriend() {
		return starFriend;
	}

	public void setStarFriend(int starFriend) {
		this.starFriend = starFriend;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getFollow() {
		return follow;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
//	/**
//	 * 用来区分是否是"应用"?
//	 */
//	public int appAccountFlag;
//	
//	/**
//	 * 性别
//	 */
//	public int sex;
//
//	/**
//	 * 签名
//	 */
//	public String signature;
//
//	/**
//	 * WEB版上,"应用"的该字段都是24
//	 */
//	public int verifyFlag;
//	/**
//	 * 省份
//	 */
//	public String province;
//
//	/**
//	 * 城市
//	 */
//	public String city;
//
//	/**
//	 * 别名
//	 */
//	public String alias;
//
//	/**
//	 * 备注名称
//	 */
//	public String remarkName;
//
//	/**
//	 * RemarkName汉子拼音首字母与英文
//	 */
//	public String remarkPYInitial;
//
//	/**
//	 * RemarkName汉子拼音与英文
//	 */
//	public String remarkPYQuanPin;

	
	
	
	
}
