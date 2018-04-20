/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.dao.customized;

import java.util.List;

import javax.annotation.Resource;

import com.yuanxin.app.app.appobject.ClientAO;
import com.yuanxin.app.app.entity.gen.ClientCriteria;
import com.yuanxin.app.app.entity.gen.ClientCustomizedCriteria;
import com.yuanxin.app.app.entity.gen.ObjectClient;
import com.yuanxin.common.dao.base.BaseCustomizedMapper;


public interface ClientCustomziedMapper extends BaseCustomizedMapper<ClientAO, ClientCustomizedCriteria> {

	public List<ObjectClient> getByCriteria(ClientCustomizedCriteria criteria);
	
	public List<ObjectClient> getByPrimaryKey(String id);
	
	public int getCountByCriteria(ClientCustomizedCriteria criteria);
}
