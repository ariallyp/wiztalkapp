package com.yuanxin.app.app.entity.gen;

import java.io.Serializable;

public class AppTenant implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_tenant.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_tenant.tenant_id
     *
     * @mbggenerated
     */
    private String tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_tenant.app_id
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_tenant.follow
     *
     * @mbggenerated
     */
    private String follow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_tenant
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_tenant.id
     *
     * @return the value of app_tenant.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_tenant.id
     *
     * @param id the value for app_tenant.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_tenant.tenant_id
     *
     * @return the value of app_tenant.tenant_id
     *
     * @mbggenerated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_tenant.tenant_id
     *
     * @param tenantId the value for app_tenant.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_tenant.app_id
     *
     * @return the value of app_tenant.app_id
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_tenant.app_id
     *
     * @param appId the value for app_tenant.app_id
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_tenant.follow
     *
     * @return the value of app_tenant.follow
     *
     * @mbggenerated
     */
    public String getFollow() {
        return follow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_tenant.follow
     *
     * @param follow the value for app_tenant.follow
     *
     * @mbggenerated
     */
    public void setFollow(String follow) {
        this.follow = follow == null ? null : follow.trim();
    }
}