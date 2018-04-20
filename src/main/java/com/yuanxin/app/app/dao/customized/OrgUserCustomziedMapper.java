/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.dao.customized;

import javax.annotation.Resource;

import com.yuanxin.app.app.appobject.OrgUserAO;
import com.yuanxin.app.app.entity.gen.OrgUserCriteria;
import com.yuanxin.common.dao.base.BaseCustomizedMapper;


public interface OrgUserCustomziedMapper extends BaseCustomizedMapper<OrgUserAO, OrgUserCriteria> {
	
 public void deleteByUserId(String userId);
 
 public void deleteByOrgId(String orgId);
}
