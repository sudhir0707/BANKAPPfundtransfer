package com.hcl.ingbank.entity;

public class TranscationDetails {
	private double frmaccNum;
	private double toaccNum;
	private double ammount;
	private String date;
	
	public double getFrmaccNum() {
		return frmaccNum;
	}
	public void setFrmaccNum(double frmaccNum) {
		this.frmaccNum = frmaccNum;
	}
	public double getToaccNum() {
		return toaccNum;
	}
	public void setToaccNum(double toaccNum) {
		this.toaccNum = toaccNum;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}

