package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.model.CustomerLengthNotFoundException;

@ControllerAdvice
public class CustomerExceptionController {
	@ExceptionHandler(CustomerLengthNotFoundException.class)
	public ResponseEntity<String> exception(CustomerLengthNotFoundException e)
	{
		return new ResponseEntity<>("Length is not correct",HttpStatus.NOT_FOUND);
	}
	

}
