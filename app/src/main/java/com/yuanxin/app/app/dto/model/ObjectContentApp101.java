package com.yuanxin.app.app.dto.model;


public class ObjectContentApp101 extends ObjectContent{

	private static final long serialVersionUID = 885201866274669264L;
	
	public String appId;
	public String sendAppId;
	public Data data;

	public static class Data {
		public String title;
		public String content;
	}
}
