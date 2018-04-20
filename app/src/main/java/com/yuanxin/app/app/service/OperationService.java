/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.OperationAO;
import com.yuanxin.app.app.dao.gen.OperationGeneratedMapper;
import com.yuanxin.app.app.entity.gen.OperationCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class OperationService extends AbstractBaseAOService<OperationAO, OperationCriteria> implements IOperationService {

    private static Logger LOG = LoggerFactory.getLogger(OperationService.class);

    @Resource
    private OperationGeneratedMapper operationGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<OperationAO, OperationCriteria> getGeneratedMapper() {
        return operationGeneratedMapper;
    }

}
