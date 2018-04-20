/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ClientPluginVersionAO;
import com.yuanxin.app.app.dao.gen.ClientPluginVersionGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ClientPluginVersionCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class ClientPluginVersionService extends AbstractBaseAOService<ClientPluginVersionAO, ClientPluginVersionCriteria> implements IClientPluginVersionService {

    private static Logger LOG = LoggerFactory.getLogger(ClientPluginVersionService.class);

    @Resource
    private ClientPluginVersionGeneratedMapper clientPluginVersionGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<ClientPluginVersionAO, ClientPluginVersionCriteria> getGeneratedMapper() {
        return clientPluginVersionGeneratedMapper;
    }

}
