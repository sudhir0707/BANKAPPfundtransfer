package com.hcl.ingbank.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class ErrorMessage {

	
	private String message;
	private int statuscode;
	private String status;
}
