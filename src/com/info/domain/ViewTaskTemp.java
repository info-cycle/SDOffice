package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ViewTaskTemp entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "View_TaskTemp", schema = "dbo", catalog = "SDOffice")
public class ViewTaskTemp implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 475688172446062775L;
	private Integer FId;
	private Integer FParentId;
	private String FName;
	private Integer isTask;
	private Integer FTaskId;

	// Constructors

	/** default constructor */
	public ViewTaskTemp() {
	}

	/** minimal constructor */
	public ViewTaskTemp(Integer FId, Integer isTask, Integer FTaskId) {
		this.FId = FId;
		this.isTask = isTask;
		this.FTaskId = FTaskId;
	}

	/** full constructor */
	public ViewTaskTemp(Integer FId, Integer FParentId, String FName,
			Integer isTask, Integer FTaskId) {
		this.FId = FId;
		this.FParentId = FParentId;
		this.FName = FName;
		this.isTask = isTask;
		this.FTaskId = FTaskId;
	}

	// Property accessors
	@Id
	@Column(name = "F_ID", nullable = false)
	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	@Column(name = "F_Parent_ID")
	public Integer getFParentId() {
		return this.FParentId;
	}

	public void setFParentId(Integer FParentId) {
		this.FParentId = FParentId;
	}

	@Column(name = "F_Name", length = 200)
	public String getFName() {
		return this.FName;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}

	@Column(name = "IsTask", nullable = false)
	public Integer getIsTask() {
		return this.isTask;
	}

	public void setIsTask(Integer isTask) {
		this.isTask = isTask;
	}

	@Column(name = "F_Task_ID", nullable = false)
	public Integer getFTaskId() {
		return this.FTaskId;
	}

	public void setFTaskId(Integer FTaskId) {
		this.FTaskId = FTaskId;
	}

}