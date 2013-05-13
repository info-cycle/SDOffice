/**
 * @Title		: AppSEQHelper.java
 * @Date		: 2012-03-19 10:50:35
 * @Author		: liwx
 * @Description	: 获取流水号持久化
 * @TODO List	: 
 
 * Copyright 2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.info.common.dao.AppSEQDao;
import com.info.domain.TAppSeq;

/**
 * @ClassName	: AppSEQHelper   
 * @Description	: 自增序列号
 * @Author		: liwx
 * @Date		: 2012-3-19 11:20   
 */
@Component
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class AppSEQHelper {	
	private String defaultSeqName = "SEQ_Application";
	@Autowired
	AppSEQDao seqDAO;
	/**
	 * @Description	: 获取序列名称默认为SEQ_Application的自增号
	 * @Author		: liwx
	 * @Date		: 2013-04-02 14-34
	 * @return
	 */
	public Integer getCurrentVal() {
		return getCurrentVal(defaultSeqName);
	}

	/**
	 * @Description	: 获取序列号
	 * @Author		: liwx
	 * @Date		: 2013-04-02 14-35
	 * @param SeqName
	 * @return
	 */
	public Integer getCurrentVal(String SeqName) {
		Integer result = 0;
		try {
			TAppSeq obj = seqDAO.getBy(SeqName);
			if (obj == null) {
				TAppSeq newobj = new TAppSeq(getCurrentVal(), SeqName, 1);
				seqDAO.persist(newobj);
				result = 1;
			} else {
				result = obj.getFCurrentval().intValue()+1;
				obj.setFCurrentval(result);				
				seqDAO.update(obj);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}