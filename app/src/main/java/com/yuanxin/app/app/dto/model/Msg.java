package com.yuanxin.app.app.dto.model;


import java.util.ArrayList;



/**
 * 消息：用于发送与接收<br/>
 * 发送：只使用 FromUserName、ToUserName、MsgType、Content、MediaId、ClientMsgId；<br/>
 * 
 * @author liuxue
 *
 */
public class Msg extends BaseMsg {

	private static final long serialVersionUID = -6790642716436712051L;

	/**
	 * 普通消息-文本
	 */
	public static final int MSG_TYPE_NORMAL = 1;

	/**
	 * 普通消息-图片
	 */
	public static final int MSG_TYPE_IMAGE = 2;
	
	/**
	 * 普通消息-语音
	 */
	public static final int MSG_TYPE_VOICE = 3;
	
	/**
	 * 删除聊天会话列表
	 */
	public static final int MSG_TYPE_DELETE_CHAT = 9;
	
	/**
	 * 普通消息-提示
	 */
	public static final int MSG_TYPE_TIPS = 51;

	/**
	 * 应用消息-类型1
	 * <p>
	 * ObjectContent : {@link com.yxst.epic.yixin.data.dto.model.ObjectContentApp101
	 * ObjectContentApp101}
	 * <p>
	 * 
	 * @see com.yxst.epic.yixin.data.dto.model.ObjectContentApp101
	 */
	public static final int MSG_TYPE_APP_101 = 101;
	
	public static final int MSG_TYPE_APP_102 = 102;
	
	public static final int MSG_TYPE_APP_103 = 103;
	
	public static final int MSG_TYPE_APP_104 = 104;

	/**
	 * 系统消息-更新
	 * <p>
	 * ObjectContent : {@link com.yxst.epic.yixin.data.dto.model.ObjectContentUpdate
	 * ObjectContentUpdate}
	 * <p>
	 * 
	 * @see com.yxst.epic.yixin.data.dto.model.ObjectContentUpdate
	 */
	public static final int MSG_TYPE_UPDATE = 1001;

	public String deviceID;
	
	/**
	 * 消息ID（服务器）
	 */
	public String msgId;

	/**
	 * 消息ID（本地生成）
	 */
	public String clientMsgId;

	/**
	 * 发送人用户名（发送人可以是人、应用、群）
	 */
	public String fromUserName;

	public String fromDisplayName;

	public String toDisplayName;

	/**
	 * 接收人用户名（接收人可以是人、应用、群）
	 */
	public String toUserName;

	/**
	 * 消息类型 文本消息、图片消息、视频消息
	 */
	public int msgType;

	/**
	 * 消息内容<br/>
	 * 发送：图片消息不使用Content，使用MediaId<br/>
	 * 接收：消息内容 除简单文本，也可能为复杂格式的消息。如JSON格式。<br/>
	 */
	public String content;


	private Object objectContent;


	
	/**
	 * 资源ID<br/>
	 * 图片消息、视频消息等上传服务器成功后，返回的资源ID
	 */
	public String mediaId;

	public int status;

	/**
	 * 创建时间（服务器）
	 */
	public Long createTime;

	/**
	 * 消息点击后跳转的URL
	 */
	public String url;

	/**
	 * 应用消息 的 类型 非应用消息为0
	 */
	public String appMsgType;
	public Long expire;

	public ArrayList<String> activeSessions = new ArrayList<String>(0);

	public String toUserKey;

	public String statusId;

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getClientMsgId() {
		return clientMsgId;
	}

	public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getFromDisplayName() {
		return fromDisplayName;
	}

	public void setFromDisplayName(String fromDisplayName) {
		this.fromDisplayName = fromDisplayName;
	}

	public String getToDisplayName() {
		return toDisplayName;
	}

	public void setToDisplayName(String toDisplayName) {
		this.toDisplayName = toDisplayName;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Object getObjectContent() {
		return objectContent;
	}

	public void setObjectContent(Object objectContent) {
		this.objectContent = objectContent;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAppMsgType() {
		return appMsgType;
	}

	public void setAppMsgType(String appMsgType) {
		this.appMsgType = appMsgType;
	}

	public Long getExpire() {
		return expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
	}

	public ArrayList<String> getActiveSessions() {
		return activeSessions;
	}

	public void setActiveSessions(ArrayList<String> activeSessions) {
		this.activeSessions = activeSessions;
	}

	public String getToUserKey() {
		return toUserKey;
	}

	public void setToUserKey(String toUserKey) {
		this.toUserKey = toUserKey;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	
}
