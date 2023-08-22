package com.model;

public class CustomerLengthNotFoundException extends RuntimeException{
	private String message;
	public CustomerLengthNotFoundException(String message)
	{
		this.message=message;
	}
	
	public String toString()
	{
		return "error-->"+message;
	}

}
