/**
 * @Title		: bussHistoryService.java
 * @Date		: 2013-04-15 10-44
 * @Author		: chunlei
 * @Description	: TODO(用一句话描述该文件做什么)
 * @TODO List	: 
 * (增加、修改)了什么  at 日期 时间  by chunlei
 * 如:增加delete删除人员方法 at 2013-01-01 16:18 by chunlei

 * Copyright 2013 Info-Cycle, Inc. All rights reserved.
 */
package com.info.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.info.common.dao.IBaseDao;
import com.info.domain.TCheckReview;
import com.info.domain.TCustomerEvaluation;
import com.info.domain.TEfficiencyWage;
import com.info.domain.TImplementPlan;
import com.info.domain.TMajorMattersReport;
import com.info.domain.TProjectAppraisalScoure;
import com.info.domain.TProjectCheck;
import com.info.domain.TProjectProcess;
import com.info.domain.TWfProcess;
import com.info.domain.TWfProcessType;
import com.info.domain.ViewTaskTemp;

@Service
@Transactional
public class bussHistoryService {
    @Autowired
    IBaseDao<TWfProcess> processDao;
    @Autowired
    IBaseDao<TWfProcessType> procedsTypeDao;
    @Autowired
    IBaseDao<ViewTaskTemp> taskTempDao;
    @Autowired
    IBaseDao<TProjectProcess> propDao;
    @Autowired
    IBaseDao<TProjectCheck> projectCDao;
    @Autowired
    IBaseDao<TMajorMattersReport> reportDao;
    @Autowired
    IBaseDao<TCheckReview> checkReviewDao;
    @Autowired
    IBaseDao<TProjectAppraisalScoure> pasDao;
    @Autowired
    IBaseDao<TCustomerEvaluation> customerDao;
    @Autowired
    IBaseDao<TEfficiencyWage> effDao;
    /**
     * 
     * @Description	: 根据类型返回process
     * @Author		: chunlei
     * @Date		: 2013-04-15 14-53
     * @param typeId 类型Id
     * @param start 开始的记录
     * @param limit 结束的记录
     * @param name 任务名
     * @param time 创建时间
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<TWfProcess> getProcessBytype(int typeId,int start,int limit,String name,String entrustUnit,String Industry,String department,String giveperson,String projmgr){
	String sql="";
	switch (typeId) {
	    case 10001:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
		+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
		+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=wf.F_Form_PKID ";
		break;
	    case 10003:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectProcess p  right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
		break;
	    case 10004:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectCheck p  right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10005:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select m.F_id from T_MajorMattersReport m right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=m.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10006:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select c.F_Id from T_CheckReview c right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=c.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10007:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectAppraisalScoure p right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
		break;
	    case 10008:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select c.F_Id from T_CustomerEvaluation c right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ?"
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=c.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10009:
		sql="select wf.* from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select F_Id from T_EfficiencyWage e right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ?"
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=e.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    }
	Query query=processDao.CreateNativeSQL(sql,TWfProcess.class);
	query.setParameter(1, typeId);
	query.setParameter(2, name);
	query.setParameter(3, entrustUnit);
	query.setParameter(4,Industry);
	query.setParameter(5, department);
	query.setParameter(6, giveperson);
	query.setParameter(7, projmgr);
	return query.getResultList();
    }
    
    
     

    /**
     * 
     * @Description	: 返回记录总条数
     * @Author		: chunlei
     * @Date		: 2013-04-15 15-08
     * @param typeId
     * @param name
     * @param time
     * @return
     */
    public Long getCountP(int typeId,int start,int limit,String name,String entrustUnit,String Industry,String department,String giveperson,String projmgr) {
	String sql="";
	switch (typeId) {
	    case 10001:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
		+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
		+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=wf.F_Form_PKID ";
		break;
	    case 10003:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectProcess p  right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
		break;
	    case 10004:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectCheck p  right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10005:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select m.F_id from T_MajorMattersReport m right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=m.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10006:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select c.F_Id from T_CheckReview c right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=c.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10007:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select p.F_Id from T_ProjectAppraisalScoure p right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ? "
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=p.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
		break;
	    case 10008:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select c.F_Id from T_CustomerEvaluation c right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ?"
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=c.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    case 10009:
		sql="select count(*) from (select * from T_Wf_Process P where F_TYPE_ID=? and F_isHistory=1) wf left join "
			+"(select F_Id from T_EfficiencyWage e right join "
			+"(select F_ID from View_Task_Temp where F_Task_Name like ? and F_EntrustUnit_Name like ? and F_Industry_Category_Name like ?"
			+"and F_Department_Name like ? and F_GivePerson_Name like ? and F_ProjMgr_Name like ?) t on t.F_ID=e.FK_Task_ID "
			+") o o.F_ID= wf.F_Form_PKID";
	    	break;
	    }
	Query query=processDao.CreateNativeSQL(sql);
	query.setParameter(1, typeId);
	query.setParameter(2, name);
	query.setParameter(3, entrustUnit);
	query.setParameter(4,Industry);
	query.setParameter(5, department);
	query.setParameter(6, giveperson);
	query.setParameter(7, projmgr);
	return Long.valueOf(query.getSingleResult().toString());
    }
    /**
     * 
     * @Description	: 返回processTypes
     * @Author		: chunlei
     * @Date		: 2013-04-15 15-23
     * @return
     */
  @SuppressWarnings("unchecked")
    public List<TWfProcessType>  getProcessType() {
        String sql="select * from T_Wf_Process_Type";
        Query query=procedsTypeDao.CreateNativeSQL(sql,TWfProcessType.class);
        return query.getResultList();
    }
    
}
