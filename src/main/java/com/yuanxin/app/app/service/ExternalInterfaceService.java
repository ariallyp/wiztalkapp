/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ExternalInterfaceAO;
import com.yuanxin.app.app.dao.gen.ExternalInterfaceGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ExternalInterfaceCriteria;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;
import com.yuanxin.framework.service.ServiceResult;


@Service
public class ExternalInterfaceService extends AbstractBaseAOService<ExternalInterfaceAO, ExternalInterfaceCriteria> implements IExternalInterfaceService {

    private static Logger LOG = LoggerFactory.getLogger(ExternalInterfaceService.class);

    @Resource
    private ExternalInterfaceGeneratedMapper externalInterfaceGeneratedMapper;

    @Override
    protected BaseGeneratedMapper<ExternalInterfaceAO, ExternalInterfaceCriteria> getGeneratedMapper() {
        return externalInterfaceGeneratedMapper;
    }

	@Override
	public ServiceResult<List<ExternalInterfaceAO>> getExternalInterfaceByCustomerIdAndType(String customerId, String type) {
	      ExternalInterfaceCriteria example = new ExternalInterfaceCriteria();
	      example.createCriteria().andCustomerIdEqualTo(customerId).andTypeEqualTo(type);
	      return this.selectByCriteria(example);
	}

}
