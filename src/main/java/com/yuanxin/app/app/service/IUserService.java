/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import com.yuanxin.common.service.base.IBaseAOService;
import com.yuanxin.framework.service.ServiceResult;
import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.entity.gen.UserCriteria;

public interface IUserService extends IBaseAOService<UserAO, UserCriteria> {

			/**
			 *  插入对象到数据库
			 * @param entityAO
			 * @return
			 */
    ServiceResult<Boolean> insert(UserAO entityAO);
 
}

