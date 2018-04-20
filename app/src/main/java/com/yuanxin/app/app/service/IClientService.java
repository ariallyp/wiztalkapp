/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import com.yuanxin.common.service.base.IBaseAOService;

import java.util.List;

import com.yuanxin.app.app.appobject.ClientAO;
import com.yuanxin.app.app.entity.gen.ClientCriteria;
import com.yuanxin.app.app.entity.gen.ClientCustomizedCriteria;
import com.yuanxin.app.app.entity.gen.ObjectClient;

public interface IClientService extends IBaseAOService<ClientAO, ClientCriteria> {

   public List<ObjectClient> getByCriteria(ClientCustomizedCriteria criteria);
	
	public List<ObjectClient> getByPrimaryKey(String id);
	
	public int getCountByCriteria(ClientCustomizedCriteria criteria);
}

