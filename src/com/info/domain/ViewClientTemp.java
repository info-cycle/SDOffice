package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ViewClientTemp entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "View_ClientTemp", schema = "dbo", catalog = "SDOffice")
public class ViewClientTemp implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = -5762584232783434385L;
	private Integer FId;
	private Integer FParentId;
	private String FName;
	private Integer isClient;
	private Integer FClientId;

	// Constructors

	/** default constructor */
	public ViewClientTemp() {
	}

	/** minimal constructor */
	public ViewClientTemp(Integer FId, Integer FParentId, Integer isClient,
			Integer FClientId) {
		this.FId = FId;
		this.FParentId = FParentId;
		this.isClient = isClient;
		this.FClientId = FClientId;
	}

	/** full constructor */
	public ViewClientTemp(Integer FId, Integer FParentId, String FName,
			Integer isClient, Integer FClientId) {
		this.FId = FId;
		this.FParentId = FParentId;
		this.FName = FName;
		this.isClient = isClient;
		this.FClientId = FClientId;
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

	@Column(name = "F_Parent_ID", nullable = false)
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

	@Column(name = "IsClient", nullable = false)
	public Integer getIsClient() {
		return this.isClient;
	}

	public void setIsClient(Integer isClient) {
		this.isClient = isClient;
	}

	@Column(name = "F_Client_ID", nullable = false)
	public Integer getFClientId() {
		return this.FClientId;
	}

	public void setFClientId(Integer FClientId) {
		this.FClientId = FClientId;
	}

}