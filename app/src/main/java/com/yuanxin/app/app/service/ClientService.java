/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.yuanxin.app.app.appobject.ClientAO;
import com.yuanxin.app.app.dao.customized.ClientCustomziedMapper;
import com.yuanxin.app.app.dao.gen.ClientGeneratedMapper;
import com.yuanxin.app.app.entity.gen.ClientCriteria;
import com.yuanxin.app.app.entity.gen.ClientCustomizedCriteria;
import com.yuanxin.app.app.entity.gen.ObjectClient;
import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.AbstractBaseAOService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;


@Service
public class ClientService extends AbstractBaseAOService<ClientAO, ClientCriteria> implements IClientService {

    private static Logger LOG = LoggerFactory.getLogger(ClientService.class);

    @Resource
    private ClientGeneratedMapper clientGeneratedMapper;
    
    @Resource
    private ClientCustomziedMapper clientCustomziedMapper;

    @Override
    protected BaseGeneratedMapper<ClientAO, ClientCriteria> getGeneratedMapper() {
        return clientGeneratedMapper;
    }

	@Override
	public List<ObjectClient> getByCriteria(ClientCustomizedCriteria criteria) {
		// TODO Auto-generated method stub
		return clientCustomziedMapper.getByCriteria(criteria);
	}

	@Override
	public List<ObjectClient> getByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return clientCustomziedMapper.getByPrimaryKey(id);
	}

	@Override
	public int getCountByCriteria(ClientCustomizedCriteria criteria) {
		// TODO Auto-generated method stub
		return clientCustomziedMapper.getCountByCriteria(criteria);
	}

}
