package com.yuanxin.app.app.dto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ObjectContentApp102 extends ObjectContent {

	private static final long serialVersionUID = 8086571385122627894L;

	public String appId;

	public AppInfo appInfo;

	public Head head;

	public List<Body> body = new ArrayList<Body>();

	public List<Operation> operations = new ArrayList<Operation>();

	public boolean statusFinish;
	
	public static class AppInfo {
		public String appId;
		public String appName;
	}

	public static class Head {
		public String content;
		public Long pubTime;
	}

	public static class Body {
		public String content;
	}

	public static class Operation implements Serializable {
		private static final long serialVersionUID = -624657666302738468L;

		public static String MSG_TYPE_BROWSER = "1";
		public static String MSG_TYPE_REST = "2";

		public String id;
		public String appId;
		public int sort;

		public String content;
//		public String msgType;
		public String operationType;
		public String action;

//		public List<Operation> opertionList = new ArrayList<Operation>();
		public List<Operation> operationList = new ArrayList<Operation>();

		public void addOperation(Operation operation) {
			this.operationList.add(operation);
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public int getSort() {
			return sort;
		}

		public void setSort(int sort) {
			this.sort = sort;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getOperationType() {
			return operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public String getAction() {
			return action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public List<Operation> getOperationList() {
			return operationList;
		}

		public void setOperationList(List<Operation> operationList) {
			this.operationList = operationList;
		}

	}
}
