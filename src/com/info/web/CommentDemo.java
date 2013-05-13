/**
 * @Title		: CommentDemo.java
 * @Date		: 2013-03-19 10:50:35
 * @Author		: liwx
 * @Description	: 代码注释样例，今后各项目成员请自行按此样例中的注释规范编写注释
 * @TODO List	: (如果是新建文件时新建的代码无需在此处记录)
 * 增加人员查找函数 at 2013-03-19 11:00 by liwx
 * 修改人员查找方法中的条件  at 2013-03-19 11:20 by liwx
 * 删除修改人员方法，此处无需此方法 at 2013-03-19 11:20 by liwx
 * Copyright 2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.web;

import org.springframework.stereotype.Controller;

import com.info.common.util.StringUtil;

/**   
 * @ClassName	: CommentDemo   
 * @Description	: TODO(这里用一句话描述这个类的作用)   
 * @Author		: liwx
 * @Date		: 2013-03-20 10-57   
 *      
 */

@Controller
public class CommentDemo {
	//人员编号
	@SuppressWarnings("unused")
	private String fId;
	//人员类型
	@SuppressWarnings("unused")
	private int typeId;
	@SuppressWarnings("unused")
	private String userName;
	/**
	 * 
	 * @Description	: 通过姓名模糊查询人员信息
	 * @Author		: liwx
	 * @Date		: 2013-3-19 11:30
	 * @param fid
	 * @param typeId 0:暂缓从业,1:从业,2:无法确定
	 * @param userName
	 * @return
	 */

	public String getUserByName(String fid,int typeId,String userName) {
		//如果是后期新增的代码请加如下注释
		/**
		 * added by liwx at 2013-03-19 11:40
		 * @Description:增加判断人员类型，不同的类型业务管理不同,如果算法逻辑较复杂，
		 * 请把算法实现详细描述
		 */
		switch (typeId) {
		case 0://如果上面的注释中没有说明0代表什么意思，请在此处注明
			
			break;
		case 1://同上
			break;
		case 2://同时
			break;
		default:
			break;
		}
		
		//如果是在原有代码上做修改请增加如下注释
		/**
		 * modified by liwx at 2013-03-19 11:30
		 * @Description		: 出于什么原因要修改代码，修改的代码起到什么作用，达到什么效果
		 */
		//如果修改的代码是一整块，请做块注释
		/*if(userName==null){
			
		}else{
			
		}*/
		//如果只是修改一句带码，请做如下注释
		//if(userName==null){
		if(StringUtil.isEmpty(userName)){
			
		}
		
		//如果需删除原有代码，请做如下注释，此处代码需是上线的系统，如不是无需加此注释
		/**
		 * deleted by liwx at 2013-03-19 11:40
		 * @Description		: 由于在实际应用中，真实的业务管理不是这样的
		 */
		/*if(StringUtil.isEmpty(userName)){
			
		}*/
		
		return null;
	}
}
