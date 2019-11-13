package com.hcl.ingbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingbank.dto.CustmerRegistrationDTO;
import com.hcl.ingbank.dto.ResponseDTO;
import com.hcl.ingbank.dto.TransactionDetailsDTO;
import com.hcl.ingbank.exception.InsufficientBalance;
import com.hcl.ingbank.service.BankService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/FundTransfer")
public class BankController {

	@Autowired 
	BankService bankService;
	
//	@PostMapping("/dishes")
//	public ResponseEntity<ResponseDto> addDish(@RequestBody DishesAddingInput dishesAddingInput) throws DishException {
//
//		
//		ResponseDto response = dishService.addDish(dishesAddingInput);
//		log.info("DishController :: Added Dish --- ");
//		return new ResponseEntity<>(response, HttpStatus.CREATED);
//
//	}
//	@PutMapping("/Update Dish")
//	public ResponseEntity<ResponseDto> upDateDish(@RequestBody UpdateDto updateDto) throws DishException {
//		
//		ResponseDto response = dishService.upDateDish(updateDto);
//		log.info("DishController :: Updated Dish --- ");
//		return new ResponseEntity<>(response,HttpStatus.ACCEPTED );
//	}
	
	@PostMapping("/CustomerRegistration")
	public ResponseEntity<ResponseDTO> CustRegistration(@RequestBody CustmerRegistrationDTO custmerRegistrationDTO) throws InsufficientBalance
	{
		ResponseDTO response=bankService.CustRegistration(custmerRegistrationDTO);
		log.info("BankController:: Customer Registration.....");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@PutMapping("/FundTransfer")
	public ResponseEntity<ResponseDTO> Transaction(@RequestBody TransactionDetailsDTO transactionDetailsDTO) throws InsufficientBalance
	{
		ResponseDTO response=bankService.Transaction(transactionDetailsDTO);
		log.info("Bank Controller:: Amount Transfred....");
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.ACCEPTED);
	}
}
