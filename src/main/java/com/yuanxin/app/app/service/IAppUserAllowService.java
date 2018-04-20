/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import com.yuanxin.common.service.base.IBaseAOService;
import com.yuanxin.app.app.appobject.AppUserAllowAO;
import com.yuanxin.app.app.entity.gen.AppUserAllowCriteria;

public interface IAppUserAllowService extends IBaseAOService<AppUserAllowAO, AppUserAllowCriteria> {

	  public int InsertAppUserAllowAO(AppUserAllowAO obj);
}

