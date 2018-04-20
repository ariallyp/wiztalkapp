/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import java.util.List;

import com.yuanxin.common.service.base.IBaseAOService;
import com.yuanxin.framework.service.ServiceResult;
import com.yuanxin.app.app.appobject.ExternalInterfaceAO;
import com.yuanxin.app.app.entity.gen.ExternalInterfaceCriteria;

public interface IExternalInterfaceService extends IBaseAOService<ExternalInterfaceAO, ExternalInterfaceCriteria> {

	ServiceResult<List<ExternalInterfaceAO>> getExternalInterfaceByCustomerIdAndType(String customerId,String type);
}

