/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.TenantAO;
import com.yuanxin.app.app.dao.gen.TenantGeneratedMapper;
import com.yuanxin.app.app.entity.gen.TenantCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class TenantService extends AbstractBaseAOService<TenantAO, TenantCriteria> implements ITenantService {

    private static Logger LOG = LoggerFactory.getLogger(TenantService.class);

    @Resource
    private TenantGeneratedMapper tenantGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<TenantAO, TenantCriteria> getGeneratedMapper() {
        return tenantGeneratedMapper;
    }

}
