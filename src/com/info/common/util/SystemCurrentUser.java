/**
 * @Title		: SystemCurrentUser.java
 * @Date		: 2012-03-19 10:50:35
 * @Author		: liwx
 * @Description	: 在线程中存储当前登录session，便于在各层中直接使用
 * @TODO List	: 
 
 * Copyright 2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.common.util;

import com.info.web.CurrentUser;

/**
 * @ClassName	: SystemCurrentUser   
 * @Description	: 当前登录用户信息
 * @Author		: liwx
 * @Date		: 2012-3-19 11:20   
 */
public class SystemCurrentUser {
	private static ThreadLocal<CurrentUser> currentUser = 
			new ThreadLocal<CurrentUser>();
	/**
	 * 线程变量赋值
	 * @param session
	 */
	public static void setCurrentUser(CurrentUser session){
		currentUser.set(session);
	}
	/**
	 * @Description	: 获取当前线程中的登录用户信息
	 * @Author		: liwx
	 * @Date		: 2013-1-19 上午12:02:18
	 * @return
	 */
	public static CurrentUser getCurrentUser() {
		return currentUser.get();
	}
}
