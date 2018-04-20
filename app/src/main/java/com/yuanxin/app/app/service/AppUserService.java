/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.AppUserAO;
import com.yuanxin.app.app.dao.gen.AppUserGeneratedMapper;
import com.yuanxin.app.app.entity.gen.AppUserCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
 
@Service
public class AppUserService extends AbstractBaseAOService<AppUserAO, AppUserCriteria> implements IAppUserService {

   // private static Logger LOG = LoggerFactory.getLogger(AppUserService.class);

    @Resource
    private AppUserGeneratedMapper appUserGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<AppUserAO, AppUserCriteria> getGeneratedMapper() {
        return appUserGeneratedMapper;
    }

}
