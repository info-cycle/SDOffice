package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TResultsInChapter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ResultsInChapter", schema = "dbo", catalog = "SDOffice")
public class TResultsInChapter implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 3047837588192680099L;
	private Integer FId;
	private Integer fkTaskId;
	private Integer fkContractId;
	private String FProjAchtType;
	private Double FProjectCost;
	private String FProjectScale;
	private String TTheApplicant;
	private String FDeptMgrOpinion;
	private String FGeneralOpinion;
	private String FAgent;

	// Constructors

	/** default constructor */
	public TResultsInChapter() {
	}

	/** minimal constructor */
	public TResultsInChapter(Integer FId) {
		this.FId = FId;
	}

	/** full constructor */
	public TResultsInChapter(Integer FId, Integer fkTaskId,
			Integer fkContractId, String FProjAchtType, Double FProjectCost,
			String FProjectScale, String TTheApplicant, String FDeptMgrOpinion,
			String FGeneralOpinion, String FAgent) {
		this.FId = FId;
		this.fkTaskId = fkTaskId;
		this.fkContractId = fkContractId;
		this.FProjAchtType = FProjAchtType;
		this.FProjectCost = FProjectCost;
		this.FProjectScale = FProjectScale;
		this.TTheApplicant = TTheApplicant;
		this.FDeptMgrOpinion = FDeptMgrOpinion;
		this.FGeneralOpinion = FGeneralOpinion;
		this.FAgent = FAgent;
	}

	// Property accessors
	@Id
	@Column(name = "F_ID", unique = true, nullable = false)
	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	@Column(name = "FK_Task_ID")
	public Integer getFkTaskId() {
		return this.fkTaskId;
	}

	public void setFkTaskId(Integer fkTaskId) {
		this.fkTaskId = fkTaskId;
	}

	@Column(name = "FK_Contract_ID")
	public Integer getFkContractId() {
		return this.fkContractId;
	}

	public void setFkContractId(Integer fkContractId) {
		this.fkContractId = fkContractId;
	}

	@Column(name = "F_ProjAcht_Type", length = 50)
	public String getFProjAchtType() {
		return this.FProjAchtType;
	}

	public void setFProjAchtType(String FProjAchtType) {
		this.FProjAchtType = FProjAchtType;
	}

	@Column(name = "F_ProjectCost", scale = 4)
	public Double getFProjectCost() {
		return this.FProjectCost;
	}

	public void setFProjectCost(Double FProjectCost) {
		this.FProjectCost = FProjectCost;
	}

	@Column(name = "F_ProjectScale", length = 50)
	public String getFProjectScale() {
		return this.FProjectScale;
	}

	public void setFProjectScale(String FProjectScale) {
		this.FProjectScale = FProjectScale;
	}

	@Column(name = "T_TheApplicant", length = 30)
	public String getTTheApplicant() {
		return this.TTheApplicant;
	}

	public void setTTheApplicant(String TTheApplicant) {
		this.TTheApplicant = TTheApplicant;
	}

	@Column(name = "F_DeptMgrOpinion", length = 800)
	public String getFDeptMgrOpinion() {
		return this.FDeptMgrOpinion;
	}

	public void setFDeptMgrOpinion(String FDeptMgrOpinion) {
		this.FDeptMgrOpinion = FDeptMgrOpinion;
	}

	@Column(name = "F_GeneralOpinion", length = 800)
	public String getFGeneralOpinion() {
		return this.FGeneralOpinion;
	}

	public void setFGeneralOpinion(String FGeneralOpinion) {
		this.FGeneralOpinion = FGeneralOpinion;
	}

	@Column(name = "F_Agent", length = 50)
	public String getFAgent() {
		return this.FAgent;
	}

	public void setFAgent(String FAgent) {
		this.FAgent = FAgent;
	}

}