package com.yuanxin.app.app.job;



import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.yuanxin.app.app.wsdl.service.SyncDbService;

public class SynUser extends QuartzJobBean {
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		try {
			WebApplicationContext context1 = ContextLoader.getCurrentWebApplicationContext();
			SyncDbService syncDbService = (SyncDbService) context1.getBean("syncDbService");
			syncDbService.syncdb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
