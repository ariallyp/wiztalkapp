/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ApnsTokenAO;
import com.yuanxin.app.app.dao.gen.ApnsTokenGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ApnsTokenCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
 

@Service
public class ApnsTokenService extends AbstractBaseAOService<ApnsTokenAO, ApnsTokenCriteria> implements IApnsTokenService {

    //private static Logger LOG = LoggerFactory.getLogger(ApnsTokenService.class);

    @Resource
    private ApnsTokenGeneratedMapper apnsTokenGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<ApnsTokenAO, ApnsTokenCriteria> getGeneratedMapper() {
        return apnsTokenGeneratedMapper;
    }

}
