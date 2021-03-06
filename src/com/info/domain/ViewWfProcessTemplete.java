package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ViewWfProcessTemplete entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "View_wf_process_templete", schema = "dbo", catalog = "SDOffice")
public class ViewWfProcessTemplete implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = -2548904501204772165L;
	private Integer FId;
	private String FTitle;
	private Integer FCreateUserId;
	private String FCreateUserName;
	private Integer FCurrentUserId;
	private String FCurrentUserName;
	private String FCreateTime;
	private Integer FTypeId;
	private String FTypeName;
	private String FFormUrl;
	private Integer FFormPkid;
	private Integer FState;
	private String FStateText;
	private Integer activeId;
	private String FSendUser;
	private String FSendTime;

	// Constructors

	/** default constructor */
	public ViewWfProcessTemplete() {
	}

	/** minimal constructor */
	public ViewWfProcessTemplete(Integer FId, Integer FTypeId) {
		this.FId = FId;
		this.FTypeId = FTypeId;
	}

	/** full constructor */
	public ViewWfProcessTemplete(Integer FId, String FTitle,
			Integer FCreateUserId, String FCreateUserName,
			Integer FCurrentUserId, String FCurrentUserName,
			String FCreateTime, Integer FTypeId, String FTypeName,
			String FFormUrl, Integer FFormPkid, Integer FState,
			String FStateText, Integer activeId, String FSendUser,
			String FSendTime) {
		this.FId = FId;
		this.FTitle = FTitle;
		this.FCreateUserId = FCreateUserId;
		this.FCreateUserName = FCreateUserName;
		this.FCurrentUserId = FCurrentUserId;
		this.FCurrentUserName = FCurrentUserName;
		this.FCreateTime = FCreateTime;
		this.FTypeId = FTypeId;
		this.FTypeName = FTypeName;
		this.FFormUrl = FFormUrl;
		this.FFormPkid = FFormPkid;
		this.FState = FState;
		this.FStateText = FStateText;
		this.activeId = activeId;
		this.FSendUser = FSendUser;
		this.FSendTime = FSendTime;
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

	@Column(name = "F_TITLE", length = 800)
	public String getFTitle() {
		return this.FTitle;
	}

	public void setFTitle(String FTitle) {
		this.FTitle = FTitle;
	}

	@Column(name = "F_CreateUserID")
	public Integer getFCreateUserId() {
		return this.FCreateUserId;
	}

	public void setFCreateUserId(Integer FCreateUserId) {
		this.FCreateUserId = FCreateUserId;
	}

	@Column(name = "F_CreateUserName", length = 20)
	public String getFCreateUserName() {
		return this.FCreateUserName;
	}

	public void setFCreateUserName(String FCreateUserName) {
		this.FCreateUserName = FCreateUserName;
	}

	@Column(name = "F_CurrentUserID")
	public Integer getFCurrentUserId() {
		return this.FCurrentUserId;
	}

	public void setFCurrentUserId(Integer FCurrentUserId) {
		this.FCurrentUserId = FCurrentUserId;
	}

	@Column(name = "F_CurrentUserName", length = 20)
	public String getFCurrentUserName() {
		return this.FCurrentUserName;
	}

	public void setFCurrentUserName(String FCurrentUserName) {
		this.FCurrentUserName = FCurrentUserName;
	}

	@Column(name = "F_CreateTime", length = 30)
	public String getFCreateTime() {
		return this.FCreateTime;
	}

	public void setFCreateTime(String FCreateTime) {
		this.FCreateTime = FCreateTime;
	}

	@Column(name = "f_type_id", nullable = false)
	public Integer getFTypeId() {
		return this.FTypeId;
	}

	public void setFTypeId(Integer FTypeId) {
		this.FTypeId = FTypeId;
	}

	@Column(name = "F_TYPE_NAME", length = 250)
	public String getFTypeName() {
		return this.FTypeName;
	}

	public void setFTypeName(String FTypeName) {
		this.FTypeName = FTypeName;
	}

	@Column(name = "F_FormUrl", length = 850)
	public String getFFormUrl() {
		return this.FFormUrl;
	}

	public void setFFormUrl(String FFormUrl) {
		this.FFormUrl = FFormUrl;
	}

	@Column(name = "F_Form_PKID")
	public Integer getFFormPkid() {
		return this.FFormPkid;
	}

	public void setFFormPkid(Integer FFormPkid) {
		this.FFormPkid = FFormPkid;
	}

	@Column(name = "F_STATE")
	public Integer getFState() {
		return this.FState;
	}

	public void setFState(Integer FState) {
		this.FState = FState;
	}

	@Column(name = "F_State_Text", length = 50)
	public String getFStateText() {
		return this.FStateText;
	}

	public void setFStateText(String FStateText) {
		this.FStateText = FStateText;
	}

	@Column(name = "ActiveId")
	public Integer getActiveId() {
		return this.activeId;
	}

	public void setActiveId(Integer activeId) {
		this.activeId = activeId;
	}

	@Column(name = "F_SEND_USER", length = 20)
	public String getFSendUser() {
		return this.FSendUser;
	}

	public void setFSendUser(String FSendUser) {
		this.FSendUser = FSendUser;
	}

	@Column(name = "F_SEND_TIME", length = 30)
	public String getFSendTime() {
		return this.FSendTime;
	}

	public void setFSendTime(String FSendTime) {
		this.FSendTime = FSendTime;
	}

}