/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.OrgAO;
import com.yuanxin.app.app.appobject.SkinAO;
import com.yuanxin.app.app.dao.gen.OrgGeneratedMapper;
import com.yuanxin.app.app.dao.gen.SkinGeneratedMapper;
import com.yuanxin.app.app.entity.gen.OrgCriteria;
import com.yuanxin.app.app.entity.gen.SkinCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class SkinService extends AbstractBaseAOService<SkinAO, SkinCriteria> implements ISkinService {

    private static Logger LOG = LoggerFactory.getLogger(SkinService.class);

    @Resource
    private SkinGeneratedMapper skinGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<SkinAO, SkinCriteria> getGeneratedMapper() {
        return skinGeneratedMapper;
    }

}
