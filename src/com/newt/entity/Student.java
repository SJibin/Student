package com.newt.entity;

import java.util.Date;

public class Student {
	private int sId;
	private String sName;
	private long contactNo;
	private double percentage;
	private Date admissionDate;

	public Student() {
		super();
	}

	public Student(int sId, String sName, long contactNo, double percentage, Date admissionDate) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.contactNo = contactNo;
		this.percentage = percentage;
		this.admissionDate = admissionDate;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", contactNo=" + contactNo + ", percentage=" + percentage
				+ ", admissionDate=" + admissionDate + "]";
	}

}
