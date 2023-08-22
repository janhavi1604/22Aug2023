package com.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Resourse was not created")
public class ResourceNotFoundException extends Exception {
	
	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResourceNotFoundException(String message)
	{
		this.message=message;
	}
	
	

}
