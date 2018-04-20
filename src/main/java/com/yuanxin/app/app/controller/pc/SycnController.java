/*
 * Copyright (c) 2012-2014, EpicSaaS Yuan Xin technology Co., Ltd.
 *
 * All rights reserved.
 */
package com.yuanxin.app.app.controller.pc;

import com.yuanxin.app.app.common.MVCViewName;
import com.yuanxin.app.app.job.SynOrgAndUserTask;
import com.yuanxin.app.app.job.SynUser;
import com.yuanxin.app.app.wsdl.service.SyncDbService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;










import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Hello控制器。
 * 
 */
@Controller
@RequestMapping(value = "/pc/sycn")
public class SycnController {

    private static Logger LOG = LoggerFactory.getLogger(SycnController.class);
//    @Resource
    private SyncDbService syncDbService;
    
    
    @RequestMapping(value="/syncuser")
    public String toSyncUser(){
    	return "";//MVCViewName.APP_APP_PC_SYNC_SYNCUER.toString();
    }

    @RequestMapping(value = "/db", method = { RequestMethod.GET })
//    @ResponseBody
    public String sycndb() throws Exception {
    	long beginMillis = System.currentTimeMillis();
		LOG.info("开始调用数据库同步syncDbService.syncdb()方法时的毫秒数为："+beginMillis);
		  
		syncDbService.syncdb();
		
		long endMillis = System.currentTimeMillis();
		LOG.info("数据库同步syncDbService.syncdb()方法调用结束的毫秒数为："+endMillis);
		LOG.info("调用数据库同步syncDbService.syncdb()方法一共花费了："+(endMillis-beginMillis)+"毫秒");
		
	    return "redirect:/pc/sycn/syncuser";
    }
    
    @RequestMapping(value = "/hb", method = { RequestMethod.POST})
//    @ResponseBody
    public String sycnhb(HttpServletRequest request) throws Exception {
       if("1".equals(request.getParameter("synp"))){
    	   if("d".equals(request.getParameter("synt"))){
    		   String HH = request.getParameter("timer1HH");
    		   String MM = request.getParameter("timer1MM");
    		   String SS = request.getParameter("timer1SS");
    		   StringBuffer sb = new StringBuffer();
    		   sb.append(SS+" ").append(MM+" ").append(HH+" * * ?");
    		   System.out.println(sb.toString());
    		   timedb(sb.toString());
    	   }else if("w".equals(request.getParameter("synt"))){
    		   String w =request.getParameter("week");
    		   String HH = request.getParameter("timer2HH");
    		   String MM = request.getParameter("timer3MM");
    		   String SS = request.getParameter("timer4SS");
    		   StringBuffer sb = new StringBuffer();
    		   sb.append(SS+" ").append(MM+" ").append(HH+" ? *  "+w);
    		   System.out.println(sb.toString());
    		   timedb(sb.toString());
    	   }else {
    		   String mm =request.getParameter("month");
    		   String HH = request.getParameter("timer3HH");
    		   String MM = request.getParameter("timer3MM");
    		   String SS = request.getParameter("timer3SS");
    		   StringBuffer sb = new StringBuffer();
    		   sb.append(SS+" ").append(MM+" ").append(HH+" "+mm+" * ?");
    		   System.out.println(sb.toString());
    		   timedb(sb.toString());
    	  
    	   }
       }else if("2".equals(request.getParameter("synp"))){
    	   String j =request.getParameter("jg");
		   String HH = request.getParameter("timer4HH");
		   String MM = request.getParameter("timer4MM");
		   String SS = request.getParameter("timer4SS"); 
		   StringBuffer sb = new StringBuffer();
		   sb.append(SS+" ").append(MM+" ").append(HH+"/"+j+" ? * *");
		   System.out.println(sb.toString());
		   timedb(sb.toString());
		   
       }else{
    	   timedb("0 0 0 * * ?");
       }
       
       return "redirect:/pc/sycn/syncuser";
    }
    	
  
    
    
    private void timedb(String str) throws Exception{

	  SchedulerFactory factory = new StdSchedulerFactory();
	  Scheduler scheduler = factory.getScheduler();
		 try {
			  					
			 
			 scheduler.pauseTrigger("trigger","ctrigger");
			 scheduler.unscheduleJob("trigger","ctrigger");
			 scheduler.deleteJob("synUser", "group1");
			 
			 JobDetail jobDetail = new JobDetail("synUser", "group1", SynUser.class);
			 
			 CronTrigger trigger = new CronTrigger("trigger","ctrigger");
			 
			 CronExpression cronExpression = new CronExpression(str);
			
			 trigger.setCronExpression(cronExpression);
			 			 
			 scheduler.scheduleJob(jobDetail, trigger);
			 
			 scheduler.start();
					
			} catch (SchedulerException e) {
				
				e.printStackTrace();
			}
  }
}
