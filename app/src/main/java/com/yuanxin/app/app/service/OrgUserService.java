/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.OrgUserAO;
import com.yuanxin.app.app.dao.gen.OrgUserGeneratedMapper;
import com.yuanxin.app.app.entity.gen.OrgUserCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class OrgUserService extends AbstractBaseAOService<OrgUserAO, OrgUserCriteria> implements IOrgUserService {

    private static Logger LOG = LoggerFactory.getLogger(OrgUserService.class);

    @Resource
    private OrgUserGeneratedMapper orgUserGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<OrgUserAO, OrgUserCriteria> getGeneratedMapper() {
        return orgUserGeneratedMapper;
    }

}
