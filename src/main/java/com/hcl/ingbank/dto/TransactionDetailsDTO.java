package com.hcl.ingbank.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionDetailsDTO {
	private double frmaccNum;
	private double toaccNum;
	private double ammount;
	private double balance;
	private Integer custId;
	
}
