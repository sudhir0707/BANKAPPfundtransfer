package com.hcl.ingbank.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustmerRegistrationDTO {
	private Integer custId;
	private long accNum;
	private String custName;
	private String place;
	private double mobileNum;
	private double IntialDeposit;
	
	
}
