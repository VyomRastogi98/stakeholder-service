package com.axis.stakeholderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StakeholderNotFoundException extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	public StakeholderNotFoundException(String message) {
		super(message);
	}
}
