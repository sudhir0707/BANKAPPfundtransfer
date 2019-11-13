package com.hcl.ingbank.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustmoreAccDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	private long accNum;
	private String custName;
	private String place;
	private double mobileNum;
	private double IntialDeposit;
	
	public Integer getCustId() {
		return custId;
	}
	public void setCustid(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getIntialDeposit() {
		return IntialDeposit;
	}
	public void setIntialDeposit(double intialDeposit) {
		IntialDeposit = intialDeposit;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(double mobileNum) {
		this.mobileNum = mobileNum;
	}
	
}
