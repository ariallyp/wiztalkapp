package com.yuanxin.app.app.wsdl.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuanxin.app.app.job.SynOrgAndUserTask;
import com.yuanxin.app.app.wsdl.service.SyncDbService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/WEB-INF/spring/*Context.xml")
public class Mytest {

	@Resource
	private SyncDbService synOrgAndService;
	@Test
	public void synOrgAndUserTest() throws Exception {
//		SynOrgAndUserTask task=new SynOrgAndUserTask();
//		task.syn();
		synOrgAndService.syncdb();
	}
	
}
