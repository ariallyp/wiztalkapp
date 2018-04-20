/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.AppUserAllowAO;
import com.yuanxin.app.app.dao.gen.AppUserAllowGeneratedMapper;
import com.yuanxin.app.app.entity.gen.AppUserAllowCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class AppUserAllowService extends AbstractBaseAOService<AppUserAllowAO, AppUserAllowCriteria> implements IAppUserAllowService {

    private static Logger LOG = LoggerFactory.getLogger(AppUserAllowService.class);

    @Resource
    private AppUserAllowGeneratedMapper appUserAllowGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<AppUserAllowAO, AppUserAllowCriteria> getGeneratedMapper() {
        return appUserAllowGeneratedMapper;
       
    }
    
    public int InsertAppUserAllowAO(AppUserAllowAO obj){
    	return appUserAllowGeneratedMapper.insert(obj );
    }

}
