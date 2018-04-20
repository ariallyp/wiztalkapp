package com.yuanxin.app.app.service;

import java.util.List;

/**
 * 
 * @author Admin
 *
 */
public interface IOpenfireUserSerivce {

	
	/**
	 * 向openfire 添加一个用户
	 * @param username
	 * @param password
	 * @return 
	 */
	String addUser(String username, String password,String name,String email);
	/**
	 * 删除一个用户和他的好友关系
	 * @param username
	 * @return
	 */
	String deletUser(String username);
	/**
	 * 更新一个用户的密码
	 * @param username
	 * @param password
	 * @return
	 */
	String updateUser(String username, String password,String name,String email);
	
}
