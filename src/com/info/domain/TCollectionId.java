package com.info.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TCollectionId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TCollectionId implements java.io.Serializable {

	// Fields

	/**
	 * @Fields serialVersionUID	: TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = -740202709242913709L;
	private Integer FId;
	private String FInvoiceNumber;
	private Double FInvoiceValue;
	private String FInvoiceDate;
	private Double FCollectionAmount;
	private Double FNoCollectionAmount;

	// Constructors

	/** default constructor */
	public TCollectionId() {
	}

	/** full constructor */
	public TCollectionId(Integer FId, String FInvoiceNumber,
			Double FInvoiceValue, String FInvoiceDate,
			Double FCollectionAmount, Double FNoCollectionAmount) {
		this.FId = FId;
		this.FInvoiceNumber = FInvoiceNumber;
		this.FInvoiceValue = FInvoiceValue;
		this.FInvoiceDate = FInvoiceDate;
		this.FCollectionAmount = FCollectionAmount;
		this.FNoCollectionAmount = FNoCollectionAmount;
	}

	// Property accessors

	@Column(name = "F_ID")
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

	@Column(name = "F_CollectionAmount", scale = 4)
	public Double getFCollectionAmount() {
		return this.FCollectionAmount;
	}

	public void setFCollectionAmount(Double FCollectionAmount) {
		this.FCollectionAmount = FCollectionAmount;
	}

	@Column(name = "F_NoCollectionAmount", scale = 4)
	public Double getFNoCollectionAmount() {
		return this.FNoCollectionAmount;
	}

	public void setFNoCollectionAmount(Double FNoCollectionAmount) {
		this.FNoCollectionAmount = FNoCollectionAmount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCollectionId))
			return false;
		TCollectionId castOther = (TCollectionId) other;

		return ((this.getFId() == castOther.getFId()) || (this.getFId() != null
				&& castOther.getFId() != null && this.getFId().equals(
				castOther.getFId())))
				&& ((this.getFInvoiceNumber() == castOther.getFInvoiceNumber()) || (this
						.getFInvoiceNumber() != null
						&& castOther.getFInvoiceNumber() != null && this
						.getFInvoiceNumber().equals(
								castOther.getFInvoiceNumber())))
				&& ((this.getFInvoiceValue() == castOther.getFInvoiceValue()) || (this
						.getFInvoiceValue() != null
						&& castOther.getFInvoiceValue() != null && this
						.getFInvoiceValue()
						.equals(castOther.getFInvoiceValue())))
				&& ((this.getFInvoiceDate() == castOther.getFInvoiceDate()) || (this
						.getFInvoiceDate() != null
						&& castOther.getFInvoiceDate() != null && this
						.getFInvoiceDate().equals(castOther.getFInvoiceDate())))
				&& ((this.getFCollectionAmount() == castOther
						.getFCollectionAmount()) || (this
						.getFCollectionAmount() != null
						&& castOther.getFCollectionAmount() != null && this
						.getFCollectionAmount().equals(
								castOther.getFCollectionAmount())))
				&& ((this.getFNoCollectionAmount() == castOther
						.getFNoCollectionAmount()) || (this
						.getFNoCollectionAmount() != null
						&& castOther.getFNoCollectionAmount() != null && this
						.getFNoCollectionAmount().equals(
								castOther.getFNoCollectionAmount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFId() == null ? 0 : this.getFId().hashCode());
		result = 37
				* result
				+ (getFInvoiceNumber() == null ? 0 : this.getFInvoiceNumber()
						.hashCode());
		result = 37
				* result
				+ (getFInvoiceValue() == null ? 0 : this.getFInvoiceValue()
						.hashCode());
		result = 37
				* result
				+ (getFInvoiceDate() == null ? 0 : this.getFInvoiceDate()
						.hashCode());
		result = 37
				* result
				+ (getFCollectionAmount() == null ? 0 : this
						.getFCollectionAmount().hashCode());
		result = 37
				* result
				+ (getFNoCollectionAmount() == null ? 0 : this
						.getFNoCollectionAmount().hashCode());
		return result;
	}

}