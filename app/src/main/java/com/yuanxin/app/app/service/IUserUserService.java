/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.service;

import java.util.List;

import com.yuanxin.common.dao.base.BaseGeneratedMapper;
import com.yuanxin.common.service.base.IBaseAOService;
import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.appobject.UserUserAO;
import com.yuanxin.app.app.entity.gen.UserUserCriteria;

public interface IUserUserService extends IBaseAOService<UserUserAO, UserUserCriteria> {

	public List<UserAO> getstar(String uid);

	boolean getComperisStar(String fromUid, String toUId);
 
}

