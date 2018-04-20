package com.yuanxin.app.app.wsdl.util;


import javax.annotation.Resource;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;


public class MyJobFactory extends SpringBeanJobFactory implements ApplicationContextAware {

	
//
//	@Resource
//	private AutowireCapableBeanFactory capableBeanFactory;
//	
//	public Object createJobInstance(TriggerFiredBundle bundle) throws Exception{
//		Object jobInstance = super.createJobInstance(bundle);
//		capableBeanFactory.autowireBean(jobInstance);
//		return jobInstance;
//	}
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext=applicationContext;
	}
	
	public Object createJobInstance(TriggerFiredBundle bundle) throws Exception{
		Object jobInstance = super.createJobInstance(bundle);
		applicationContext.getAutowireCapableBeanFactory().autowireBean(jobInstance);
		return jobInstance;
	}
}
