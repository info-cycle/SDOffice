/**
 * @Title		: AppSEQDao.java
 * @Date		: 2012-03-10
 * @Author		: liwx
 * @Description	: 获取流水号数据访问对象
 * @TODO List	: 
 * 增加读取数据时使用悲观锁，可处理多线程和并发问题，性能未知 by liwx at 2012-03-10
 * Copyright 2012-2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.info.domain.TAppSeq;

/**
 * @ClassName	: AppSEQDao 
 * @Description	: 自增序号
 * @Author		: liwx
 * @Date		: 2013-04-02 14-37   
 *
 */
@Repository
public class AppSEQDao {	
	@PersistenceContext
	EntityManager entityManager;
	
	public boolean persist(Object obj)
	{
		try
		{
			entityManager.persist(obj);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean update(Object obj)
	{
		try
		{
			entityManager.merge(obj);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public TAppSeq getBy(String value) {
		try
		{
			String QueryStr="select o from TAppSeq o where o.FSeqName=?1";
			Query query = entityManager.createQuery(QueryStr);
			query.setLockMode(LockModeType.PESSIMISTIC_READ);
			query.setParameter(1, value);
			return (TAppSeq) query.getSingleResult();
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
