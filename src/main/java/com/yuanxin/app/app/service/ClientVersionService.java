/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ClientVersionAO;
import com.yuanxin.app.app.dao.gen.ClientVersionGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ClientVersionCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
 

@Service
public class ClientVersionService extends AbstractBaseAOService<ClientVersionAO, ClientVersionCriteria> implements IClientVersionService {

    //private static Logger LOG = LoggerFactory.getLogger(ClientVersionService.class);

    @Resource
    private ClientVersionGeneratedMapper clientVersionGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<ClientVersionAO, ClientVersionCriteria> getGeneratedMapper() {
        return clientVersionGeneratedMapper;
    }

}
