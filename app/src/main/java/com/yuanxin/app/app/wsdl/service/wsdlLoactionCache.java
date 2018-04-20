package com.yuanxin.app.app.wsdl.service;

import org.springframework.beans.factory.annotation.Value;

public final class wsdlLoactionCache {
	
	private  static String wsdlsite;

	private  static String appwsdl;
	
	private wsdlLoactionCache wsdlLoaction;
	
	private wsdlLoactionCache(){
		
	}
	
	private static class LazyHolder{
		private static final wsdlLoactionCache wsdlLoaction=new wsdlLoactionCache();
	}
	
	public static final  wsdlLoactionCache getInstance(){
		return LazyHolder.wsdlLoaction;
	}

	public  String getWsdlsite() {
		return wsdlsite;
	}

	public  void setWsdlsite(String wsdlsite) {
		wsdlLoactionCache.wsdlsite = wsdlsite;
	}

	public  String getAppwsdl() {
		return appwsdl;
	}

	public  void setAppwsdl(String appwsdl) {
		wsdlLoactionCache.appwsdl = appwsdl;
	}

}
