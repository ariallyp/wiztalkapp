/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.dao.gen.UserGeneratedMapper;
import com.yuanxin.app.app.entity.gen.UserCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;
import com.yuanxin.framework.service.ServiceResult;

@Service
public class UserService extends AbstractBaseAOService<UserAO, UserCriteria> implements IUserService {

    private static Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserGeneratedMapper userGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<UserAO, UserCriteria> getGeneratedMapper() {
        return userGeneratedMapper;
    }

    
    @Override
    public ServiceResult<Boolean> insert(UserAO entityAO) {
		// TODO Auto-generated method stub
		ServiceResult<Boolean> ret = new ServiceResult<Boolean>();
		int result = getGeneratedMapper().insertSelective(entityAO);

		if (result > 0) {
			ret.setSucceed(true);
		} else {
			ret.setSucceed(false);
			ret.setMsg("插入对象失败");
		}
		return ret;
	}
}
