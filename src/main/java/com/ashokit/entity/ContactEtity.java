package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="Contact_Details")
public class ContactEtity {
	@Id
	@GeneratedValue
	@Column(name="Contact_Id")
	private Integer ContactId;
	
	@Column(name="Contact_Name")
	private String ContactName;
	
	@Column(name="Contact_Number")
	private long  ContactNumber;
	
	@Column(name="Contact_Email")
	private String ContactEmail;
	
	@Column(name="Active_Sw")
	private String activeSw;
	
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	@CreationTimestamp
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
	
	
	
	public Integer getContactId() {
		return ContactId;
	}
	public void setContactId(Integer contactId) {
		ContactId = contactId;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public long getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public ContactEtity(Integer contactId, String contactName, long contactNumber, String contactEmail,
			LocalDate createdDate, LocalDate updatedDate) {
		super();
		ContactId = contactId;
		ContactName = contactName;
		ContactNumber = contactNumber;
		ContactEmail = contactEmail;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "ContactEtity [ContactId=" + ContactId + ", ContactName=" + ContactName + ", ContactNumber="
				+ ContactNumber + ", ContactEmail=" + ContactEmail + ", activeSw=" + activeSw + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}
	public ContactEtity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
