/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.dao.customized;

import javax.annotation.Resource;

import com.yuanxin.app.app.appobject.AppUserAO;
import com.yuanxin.app.app.entity.gen.AppUserCriteria;
import com.yuanxin.common.dao.base.BaseCustomizedMapper;


public interface AppUserCustomziedMapper extends BaseCustomizedMapper<AppUserAO, AppUserCriteria> {

	public void deleteByUserId(String userId);
}
