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
import com.yuanxin.app.app.appobject.WizConfigAO;
import com.yuanxin.app.app.dao.gen.OrgGeneratedMapper;
import com.yuanxin.app.app.dao.gen.SkinGeneratedMapper;
import com.yuanxin.app.app.dao.gen.WizConfigGeneratedMapper;
import com.yuanxin.app.app.entity.gen.OrgCriteria;
import com.yuanxin.app.app.entity.gen.SkinCriteria;
import com.yuanxin.app.app.entity.gen.WiztalkconfigCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class WizConfigService extends AbstractBaseAOService<WizConfigAO, WiztalkconfigCriteria> implements IWizConfigService {

    private static Logger LOG = LoggerFactory.getLogger(WizConfigService.class);

    @Resource
    private WizConfigGeneratedMapper wizConigGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<WizConfigAO, WiztalkconfigCriteria> getGeneratedMapper() {
        return wizConigGeneratedMapper;
    }

}
