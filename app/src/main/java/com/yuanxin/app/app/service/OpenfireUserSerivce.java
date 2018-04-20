/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.yuanxin.app.app.util.HttpEngine;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


/**
 * 向openfire 服务器同步联系人数据，只关注数据的username和password
 * ，涉及的username只关注@前的部分，item_jid不需要资源标签
 * 
 * @author Admin
 *
 */
@Service
public class OpenfireUserSerivce implements IOpenfireUserSerivce {

	private static Logger LOG = LoggerFactory.getLogger(OpenfireUserSerivce.class);
	private static String RESOUCE_TAG = "10.180.120.63";
	private static String PLUGIN_URL = "http://" + RESOUCE_TAG+ ":9090/plugins/userService/users";

	@Override
	public String addUser(String username, String password,String name,String email) {
		String params = toUserXml(username, password, name, email);
		String result = null;
		try {
			result = HttpEngine.doPost(PLUGIN_URL, params, "POST");
			LOG.info("result : %s", result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}


	@Override
	public String deletUser(String username) {
		String result = "-1";
		result = HttpEngine.doPost(PLUGIN_URL + "/" + username, "", "DELETE");
		return result;
	}

	@Override
	public String updateUser(String username, String password,String name,String email) {
		String params = toUserXml(username, password, name, email);
		String result = null;
		result = HttpEngine.doPost(PLUGIN_URL + "/" + username, params, "PUT");
		LOG.info("result : %s", result);

		return result;
	}

	/**
	 * 生成要提交 xml数据
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	private String toUserXml(String username, String password,String name,String email) {
		/*
		 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?> <user>
		 * <username>test3</username> <password>p4ssword</password> </user>
		 */
//		StringBuffer sb = new StringBuffer();
//		// sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?");
//		sb.append("<user>");
//		sb.append("<username>").append(username).append("</username>");
//		sb.append("<password>").append(password).append("</password>");
//		sb.append("</user>");
//		return sb.toString();
		
	     Document requestDoc = DocumentHelper.createDocument();
	        Element root = requestDoc.addElement("user");
	        root.addElement("username").addText(username);
	        root.addElement("password").addText(password);
	        root.addElement("name").addText(name);
	        root.addElement("email").addText(email);
	        return root.asXML();
	}


}
