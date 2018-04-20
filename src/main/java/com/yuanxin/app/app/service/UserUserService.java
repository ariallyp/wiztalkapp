/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.appobject.UserUserAO;
import com.yuanxin.app.app.dao.customized.UserUserCustomziedMapper;
import com.yuanxin.app.app.dao.gen.UserUserGeneratedMapper;
import com.yuanxin.app.app.entity.gen.UserUserCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;

 


@Service
public class UserUserService extends AbstractBaseAOService<UserUserAO, UserUserCriteria> implements IUserUserService {

  //  private static Logger LOG = LoggerFactory.getLogger(UserUserService.class);

    @Resource
    private UserUserGeneratedMapper userUserGeneratedMapper;
    @Resource
    private UserUserCustomziedMapper userUserCustomziedMapper;
    
    @Override
    protected BaseGeneratedMapper<UserUserAO, UserUserCriteria> getGeneratedMapper() {
        return userUserGeneratedMapper;
   
    }
	@Override
	public List<UserAO> getstar(String uid) {
		// TODO Auto-generated method stub
		return userUserCustomziedMapper.getstar(uid);
	}
	@Override
	public boolean getComperisStar(String fromUserId,String toUserId) {
		// TODO Auto-generated method stub
		return userUserCustomziedMapper.getComperisStar(fromUserId, toUserId);
	}
 
}
