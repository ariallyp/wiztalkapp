package com.yuanxin.app.app.entity.gen;

import java.io.Serializable;

public class AppUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.uid
     *
     * @mbggenerated
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.appId
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.follow
     *
     * @mbggenerated
     */
    private String follow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.id
     *
     * @return the value of app_user.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.id
     *
     * @param id the value for app_user.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.uid
     *
     * @return the value of app_user.uid
     *
     * @mbggenerated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.uid
     *
     * @param uid the value for app_user.uid
     *
     * @mbggenerated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.appId
     *
     * @return the value of app_user.appId
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.appId
     *
     * @param appid the value for app_user.appId
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.follow
     *
     * @return the value of app_user.follow
     *
     * @mbggenerated
     */
    public String getFollow() {
        return follow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.follow
     *
     * @param follow the value for app_user.follow
     *
     * @mbggenerated
     */
    public void setFollow(String follow) {
        this.follow = follow == null ? null : follow.trim();
    }
}