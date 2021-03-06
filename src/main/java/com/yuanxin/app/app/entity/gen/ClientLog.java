package com.yuanxin.app.app.entity.gen;

import java.io.Serializable;
import java.util.Date;

public class ClientLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.id
     *
     * @mbggenerated
     */
	private String ip;
	
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.uid
     *
     * @mbggenerated
     */
    private String uid;

   

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.uname
     *
     * @mbggenerated
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.device_name
     *
     * @mbggenerated
     */
    private String deviceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.os_version
     *
     * @mbggenerated
     */
    private String osVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.app_version
     *
     * @mbggenerated
     */
    private String appVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.fid
     *
     * @mbggenerated
     */
    private String fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_log.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table client_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.id
     *
     * @return the value of client_log.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.id
     *
     * @param id the value for client_log.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.uid
     *
     * @return the value of client_log.uid
     *
     * @mbggenerated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.uid
     *
     * @param uid the value for client_log.uid
     *
     * @mbggenerated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.uname
     *
     * @return the value of client_log.uname
     *
     * @mbggenerated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.uname
     *
     * @param uname the value for client_log.uname
     *
     * @mbggenerated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.device_name
     *
     * @return the value of client_log.device_name
     *
     * @mbggenerated
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.device_name
     *
     * @param deviceName the value for client_log.device_name
     *
     * @mbggenerated
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.os_version
     *
     * @return the value of client_log.os_version
     *
     * @mbggenerated
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.os_version
     *
     * @param osVersion the value for client_log.os_version
     *
     * @mbggenerated
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.app_version
     *
     * @return the value of client_log.app_version
     *
     * @mbggenerated
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.app_version
     *
     * @param appVersion the value for client_log.app_version
     *
     * @mbggenerated
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.fid
     *
     * @return the value of client_log.fid
     *
     * @mbggenerated
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.fid
     *
     * @param fid the value for client_log.fid
     *
     * @mbggenerated
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_log.created
     *
     * @return the value of client_log.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_log.created
     *
     * @param created the value for client_log.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
    public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}