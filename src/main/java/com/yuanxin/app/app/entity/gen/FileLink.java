package com.yuanxin.app.app.entity.gen;

import java.io.Serializable;
import java.util.Date;

public class FileLink implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.sender_id
     *
     * @mbggenerated
     */
    private String senderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.file_id
     *
     * @mbggenerated
     */
    private String fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.file_url
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.size
     *
     * @mbggenerated
     */
    private Integer size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_link.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table file_link
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.id
     *
     * @return the value of file_link.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.id
     *
     * @param id the value for file_link.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.sender_id
     *
     * @return the value of file_link.sender_id
     *
     * @mbggenerated
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.sender_id
     *
     * @param senderId the value for file_link.sender_id
     *
     * @mbggenerated
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId == null ? null : senderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.file_id
     *
     * @return the value of file_link.file_id
     *
     * @mbggenerated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.file_id
     *
     * @param fileId the value for file_link.file_id
     *
     * @mbggenerated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.file_name
     *
     * @return the value of file_link.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.file_name
     *
     * @param fileName the value for file_link.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.file_url
     *
     * @return the value of file_link.file_url
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.file_url
     *
     * @param fileUrl the value for file_link.file_url
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.size
     *
     * @return the value of file_link.size
     *
     * @mbggenerated
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.size
     *
     * @param size the value for file_link.size
     *
     * @mbggenerated
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.created
     *
     * @return the value of file_link.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.created
     *
     * @param created the value for file_link.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_link.updated
     *
     * @return the value of file_link.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_link.updated
     *
     * @param updated the value for file_link.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}