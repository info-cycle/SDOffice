/**
 * @Title		: UrlDemo.java
 * @Date		: 2013-04-19 11-36
 * @Author		: liwx
 * @Description	: 地址映射测试
 * @TODO List	: 
 * TODO如:增加delete删除人员方法 at 2013-04-19 11-36 by liwx 

 * Copyright 2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.web.controller.wf;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info.web.controller.util.BaseController;

@Controller
public class UrlDemo extends BaseController {

	@RequestMapping(value= "/url/demo/{id}/")
	public void getDemoData(@PathVariable("id") int id, HttpServletResponse response){
		System.out.print(id);
	}
}
