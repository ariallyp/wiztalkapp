/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.dao.customized;

import javax.annotation.Resource;

import com.yuanxin.app.app.appobject.AppUserAllowAO;
import com.yuanxin.app.app.entity.gen.AppUserAllowCriteria;
import com.yuanxin.common.dao.base.BaseCustomizedMapper;


public interface AppUserAllowCustomziedMapper extends BaseCustomizedMapper<AppUserAllowAO, AppUserAllowCriteria> {
 
	public void deleteByUserId(String userId);
}
