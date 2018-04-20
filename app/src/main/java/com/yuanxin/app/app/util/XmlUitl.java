package com.yuanxin.app.app.util;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUitl {/*
	*//**
	 * 读取XML 文件.
	 * 
	 * @param 字符创
	 * @return
	 * @throws DocumentException
	 *//*
	public static Document getDocument(String str)
			throws DocumentException {
		return  DocumentHelper.parseText(str); 
	}
	*//**
	 * 获取 所有指定节点的的值 
	 * @param doc
	 * @param xpath
	 * @return 所有节点的test 集合
	 *//*
	public static List<String> getAllNodeValue(Document doc,String xpath){
		List<String> names = new ArrayList<String>();
		
		List<Element> eles = null;
		try{
			eles =  doc.selectNodes(xpath);
			if (eles!=null) {
				for(Element e:eles){
					names.add(e.getTextTrim());
				}
			}
		}catch(Exception ex){
		}
		
		return names;
	}
*/}
