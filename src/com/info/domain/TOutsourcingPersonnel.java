package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOutsourcingPersonnel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_OutsourcingPersonnel", schema = "dbo", catalog = "SDOffice")
public class TOutsourcingPersonnel implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 8716309315482281443L;
	private Integer FId;
	private String FName;
	private String FSex;
	private String FBirthday;
	private String FNativePlace;
	private String FCultureDegree;
	private String FNational;
	private String FPoliticalAffiliation;
	private String FMagor;
	private String FToWorkTime;
	private String FProfessionalQ;
	private String FQualificationNumber;
	private String FTechnical;
	private String FIdcardNumber;
	private String FContact;
	private String FHomeAddress;

	// Constructors

	/** default constructor */
	public TOutsourcingPersonnel() {
	}

	/** minimal constructor */
	public TOutsourcingPersonnel(Integer FId) {
		this.FId = FId;
	}

	/** full constructor */
	public TOutsourcingPersonnel(Integer FId, String FName, String FSex,
			String FBirthday, String FNativePlace, String FCultureDegree,
			String FNational, String FPoliticalAffiliation, String FMagor,
			String FToWorkTime, String FProfessionalQ,
			String FQualificationNumber, String FTechnical,
			String FIdcardNumber, String FContact, String FHomeAddress) {
		this.FId = FId;
		this.FName = FName;
		this.FSex = FSex;
		this.FBirthday = FBirthday;
		this.FNativePlace = FNativePlace;
		this.FCultureDegree = FCultureDegree;
		this.FNational = FNational;
		this.FPoliticalAffiliation = FPoliticalAffiliation;
		this.FMagor = FMagor;
		this.FToWorkTime = FToWorkTime;
		this.FProfessionalQ = FProfessionalQ;
		this.FQualificationNumber = FQualificationNumber;
		this.FTechnical = FTechnical;
		this.FIdcardNumber = FIdcardNumber;
		this.FContact = FContact;
		this.FHomeAddress = FHomeAddress;
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

	@Column(name = "F_Name", length = 30)
	public String getFName() {
		return this.FName;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}

	@Column(name = "F_Sex", length = 2)
	public String getFSex() {
		return this.FSex;
	}

	public void setFSex(String FSex) {
		this.FSex = FSex;
	}

	@Column(name = "F_Birthday", length = 10)
	public String getFBirthday() {
		return this.FBirthday;
	}

	public void setFBirthday(String FBirthday) {
		this.FBirthday = FBirthday;
	}

	@Column(name = "F_NativePlace", length = 30)
	public String getFNativePlace() {
		return this.FNativePlace;
	}

	public void setFNativePlace(String FNativePlace) {
		this.FNativePlace = FNativePlace;
	}

	@Column(name = "F_CultureDegree", length = 30)
	public String getFCultureDegree() {
		return this.FCultureDegree;
	}

	public void setFCultureDegree(String FCultureDegree) {
		this.FCultureDegree = FCultureDegree;
	}

	@Column(name = "F_National", length = 30)
	public String getFNational() {
		return this.FNational;
	}

	public void setFNational(String FNational) {
		this.FNational = FNational;
	}

	@Column(name = "F_PoliticalAffiliation", length = 30)
	public String getFPoliticalAffiliation() {
		return this.FPoliticalAffiliation;
	}

	public void setFPoliticalAffiliation(String FPoliticalAffiliation) {
		this.FPoliticalAffiliation = FPoliticalAffiliation;
	}

	@Column(name = "F_Magor", length = 100)
	public String getFMagor() {
		return this.FMagor;
	}

	public void setFMagor(String FMagor) {
		this.FMagor = FMagor;
	}

	@Column(name = "F_ToWorkTime", length = 30)
	public String getFToWorkTime() {
		return this.FToWorkTime;
	}

	public void setFToWorkTime(String FToWorkTime) {
		this.FToWorkTime = FToWorkTime;
	}

	@Column(name = "F_ProfessionalQ", length = 100)
	public String getFProfessionalQ() {
		return this.FProfessionalQ;
	}

	public void setFProfessionalQ(String FProfessionalQ) {
		this.FProfessionalQ = FProfessionalQ;
	}

	@Column(name = "F_QualificationNumber", length = 100)
	public String getFQualificationNumber() {
		return this.FQualificationNumber;
	}

	public void setFQualificationNumber(String FQualificationNumber) {
		this.FQualificationNumber = FQualificationNumber;
	}

	@Column(name = "F_Technical", length = 100)
	public String getFTechnical() {
		return this.FTechnical;
	}

	public void setFTechnical(String FTechnical) {
		this.FTechnical = FTechnical;
	}

	@Column(name = "F_IDCardNumber", length = 30)
	public String getFIdcardNumber() {
		return this.FIdcardNumber;
	}

	public void setFIdcardNumber(String FIdcardNumber) {
		this.FIdcardNumber = FIdcardNumber;
	}

	@Column(name = "F_Contact", length = 100)
	public String getFContact() {
		return this.FContact;
	}

	public void setFContact(String FContact) {
		this.FContact = FContact;
	}

	@Column(name = "F_HomeAddress", length = 300)
	public String getFHomeAddress() {
		return this.FHomeAddress;
	}

	public void setFHomeAddress(String FHomeAddress) {
		this.FHomeAddress = FHomeAddress;
	}

}