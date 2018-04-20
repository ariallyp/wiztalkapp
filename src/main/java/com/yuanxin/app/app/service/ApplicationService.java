/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ApplicationAO;
import com.yuanxin.app.app.dao.gen.ApplicationGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ApplicationCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;

@Service
public class ApplicationService extends AbstractBaseAOService<ApplicationAO, ApplicationCriteria> implements IApplicationService {

   // private static Logger LOG = LoggerFactory.getLogger(ApplicationService.class);

    @Resource
    private ApplicationGeneratedMapper applicationGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<ApplicationAO, ApplicationCriteria> getGeneratedMapper() {
        return applicationGeneratedMapper;
    }

}
