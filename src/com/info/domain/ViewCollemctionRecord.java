package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ViewCollemctionRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "View_COLLEMCTION_RECORD", schema = "dbo", catalog = "SDOffice")
public class ViewCollemctionRecord implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 6424265485043714034L;
	private Integer FId;
	private String FInvoiceNumber;
	private Double FInvoiceValue;
	private String FInvoiceDate;
	private String FInvoiceUnit;
	private String FInvoiceMan;
	private Integer FRecordUserId;
	private String FRecordUserName;
	private String FRecordUserTime;
	private Double FSumMoney;
	private Double FDiffMoney;

	// Constructors

	/** default constructor */
	public ViewCollemctionRecord() {
	}

	/** minimal constructor */
	public ViewCollemctionRecord(Integer FId) {
		this.FId = FId;
	}

	/** full constructor */
	public ViewCollemctionRecord(Integer FId, String FInvoiceNumber,
			Double FInvoiceValue, String FInvoiceDate, String FInvoiceUnit,
			String FInvoiceMan, Integer FRecordUserId, String FRecordUserName,
			String FRecordUserTime, Double FSumMoney, Double FDiffMoney) {
		this.FId = FId;
		this.FInvoiceNumber = FInvoiceNumber;
		this.FInvoiceValue = FInvoiceValue;
		this.FInvoiceDate = FInvoiceDate;
		this.FInvoiceUnit = FInvoiceUnit;
		this.FInvoiceMan = FInvoiceMan;
		this.FRecordUserId = FRecordUserId;
		this.FRecordUserName = FRecordUserName;
		this.FRecordUserTime = FRecordUserTime;
		this.FSumMoney = FSumMoney;
		this.FDiffMoney = FDiffMoney;
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

	@Column(name = "F_InvoiceNumber", length = 10)
	public String getFInvoiceNumber() {
		return this.FInvoiceNumber;
	}

	public void setFInvoiceNumber(String FInvoiceNumber) {
		this.FInvoiceNumber = FInvoiceNumber;
	}

	@Column(name = "F_InvoiceValue", scale = 4)
	public Double getFInvoiceValue() {
		return this.FInvoiceValue;
	}

	public void setFInvoiceValue(Double FInvoiceValue) {
		this.FInvoiceValue = FInvoiceValue;
	}

	@Column(name = "F_InvoiceDate", length = 30)
	public String getFInvoiceDate() {
		return this.FInvoiceDate;
	}

	public void setFInvoiceDate(String FInvoiceDate) {
		this.FInvoiceDate = FInvoiceDate;
	}

	@Column(name = "F_Invoice_Unit", length = 200)
	public String getFInvoiceUnit() {
		return this.FInvoiceUnit;
	}

	public void setFInvoiceUnit(String FInvoiceUnit) {
		this.FInvoiceUnit = FInvoiceUnit;
	}

	@Column(name = "F_Invoice_Man", length = 30)
	public String getFInvoiceMan() {
		return this.FInvoiceMan;
	}

	public void setFInvoiceMan(String FInvoiceMan) {
		this.FInvoiceMan = FInvoiceMan;
	}

	@Column(name = "F_Record_UserId")
	public Integer getFRecordUserId() {
		return this.FRecordUserId;
	}

	public void setFRecordUserId(Integer FRecordUserId) {
		this.FRecordUserId = FRecordUserId;
	}

	@Column(name = "F_Record_UserName", length = 30)
	public String getFRecordUserName() {
		return this.FRecordUserName;
	}

	public void setFRecordUserName(String FRecordUserName) {
		this.FRecordUserName = FRecordUserName;
	}

	@Column(name = "F_Record_UserTime", length = 30)
	public String getFRecordUserTime() {
		return this.FRecordUserTime;
	}

	public void setFRecordUserTime(String FRecordUserTime) {
		this.FRecordUserTime = FRecordUserTime;
	}

	@Column(name = "F_SumMoney", scale = 4)
	public Double getFSumMoney() {
		return this.FSumMoney;
	}

	public void setFSumMoney(Double FSumMoney) {
		this.FSumMoney = FSumMoney;
	}

	@Column(name = "F_DiffMoney", scale = 4)
	public Double getFDiffMoney() {
		return this.FDiffMoney;
	}

	public void setFDiffMoney(Double FDiffMoney) {
		this.FDiffMoney = FDiffMoney;
	}

}