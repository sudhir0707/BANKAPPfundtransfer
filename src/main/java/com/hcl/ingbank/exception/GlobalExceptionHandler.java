package com.hcl.ingbank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler 
{
@ExceptionHandler(InsufficientBalance.class)
public ResponseEntity<ErrorMessage>InsufficientBalanaceHandler(InsufficientBalance ex){

	ErrorMessage error= new ErrorMessage(ex.getMessage(),HttpStatus.NOT_FOUND.value(),"Fail");
return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

}
}
