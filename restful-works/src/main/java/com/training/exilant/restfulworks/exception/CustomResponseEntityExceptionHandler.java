package com.training.exilant.restfulworks.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.training.exilant.restfulworks.user.UserNotFoundException;
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(true));
		return new ResponseEntity<Object>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotException(Exception ex, WebRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), "sorry user not found in the database");
		return new ResponseEntity<Object>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	

}
