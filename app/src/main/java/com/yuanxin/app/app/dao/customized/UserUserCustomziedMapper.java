/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.app.app.dao.customized;

import java.util.List;

import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.appobject.UserUserAO;




public interface UserUserCustomziedMapper  {
	
	
	public List<UserAO> getstar(String uid);
	
	public Boolean getComperisStar(String fromUid,String toUId);
	
	public void deleteByUserId(String userId);

}
