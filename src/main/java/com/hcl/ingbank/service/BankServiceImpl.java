package com.hcl.ingbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.hcl.ingbank.dto.CustmerRegistrationDTO;
import com.hcl.ingbank.dto.ResponseDTO;
import com.hcl.ingbank.dto.TransactionDetailsDTO;
import com.hcl.ingbank.entity.CustmoreAccDetails;
import com.hcl.ingbank.exception.InsufficientBalance;
import com.hcl.ingbank.repository.CustomerAccRepository;
import com.hcl.ingbank.repository.TranscationRepository;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	CustomerAccRepository customerAccRepository;
	//CustomerAccRepository customerAccRepository;
	
	@Autowired
	TranscationRepository transcationRepository;
	//TranscationRepository transcationRepository;

	@Override
	public ResponseDTO CustRegistration(CustmerRegistrationDTO custmerRegistrationDTO) throws InsufficientBalance {
//		/* procedure1*/
////		Integer dishId = dishesAddingInput.getDishCategoryId();
////		dishCategoryRepository.findById(dishId);
//		
//		/* procedure2*/
Optional<CustmoreAccDetails> custRegOptional = customerAccRepository.findById(custmerRegistrationDTO.getCustId());
	if(!custRegOptional.isPresent())
	throw new InsufficientBalance("Customer is not found");
//		
//
	 CustmoreAccDetails custmoreAccDetails  = new CustmoreAccDetails();
//		
//	
//
//		/* first procedure */
////		Integer catId = dishesAddingInput.getDishCategoryId();
////		dishes.setDishCategoryId(catId);
//
//		/* second procedure */
//
////		dishes.setDishCategoryId(dishesAddingInput.getDishCategoryId());
////		dishes.setDishName(dishesAddingInput.getDishName());
////		dishes.setDishPrice(dishesAddingInput.getDishPrice());
	 custmoreAccDetails.setCustid(custmerRegistrationDTO.getCustId());
	 custmoreAccDetails.setCustName(custmerRegistrationDTO.getCustName());
	 custmoreAccDetails.setAccNum(custmerRegistrationDTO.getAccNum());
	 custmoreAccDetails.setMobileNum(custmerRegistrationDTO.getMobileNum());
	 custmoreAccDetails.setPlace(custmerRegistrationDTO.getPlace());
	 custmoreAccDetails.setIntialDeposit(custmerRegistrationDTO.getIntialDeposit());
//
//		/* third procedure */
	//BeanUtils.copyProperties(CustmerRegistrationDTO, custmoreAccDetails);
//
	//CustomerAccRepository.save(custmoreAccDetails);
//		
		ResponseDTO responseDTO=new ResponseDTO();
		responseDTO.setMessage("Customer Registered succsessfully");
     	responseDTO.setStatuscode(HttpStatus.CREATED.value());
//		
	return  responseDTO;
		//return null;
	}

	@Override
	public ResponseDTO Transaction(TransactionDetailsDTO transactionDetailsDTO) throws InsufficientBalance {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDetailsDTO> getTransactionDetailsDTO() {
		// TODO Auto-generated method stub
		return null;
	}

}
