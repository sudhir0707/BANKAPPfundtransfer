package com.hcl.ingbank.service;

import java.util.List;

import com.hcl.ingbank.dto.CustmerRegistrationDTO;
import com.hcl.ingbank.dto.ResponseDTO;
import com.hcl.ingbank.dto.TransactionDetailsDTO;
import com.hcl.ingbank.exception.InsufficientBalance;

public interface BankService {

	public ResponseDTO CustRegistration(CustmerRegistrationDTO custmerRegistrationDTO) throws InsufficientBalance;
	
	public ResponseDTO Transaction(TransactionDetailsDTO transactionDetailsDTO) throws InsufficientBalance;
	
	
	public List<TransactionDetailsDTO> getTransactionDetailsDTO();

	//public ResponseDTO customerReg(CustmerRegistrationDTO custmerRegistrationDTO);
	
}
