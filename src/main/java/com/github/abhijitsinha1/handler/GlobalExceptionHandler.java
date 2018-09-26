package com.github.abhijitsinha1.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.github.abhijitsinha1.exception.GreetingException;
import com.github.abhijitsinha1.model.GreetError;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(GreetingException.class)
	public ResponseEntity<GreetError> greetError(HttpServletRequest request, Exception ex) {
		return new ResponseEntity<GreetError>(GreetError.of(ex.getMessage()), null, HttpStatus.BAD_REQUEST);
	}
}
