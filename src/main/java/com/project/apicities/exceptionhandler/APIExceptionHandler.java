package com.project.apicities.exceptionhandler;

import java.time.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.apicities.exceptions.CountryNotFoundException;

@ControllerAdvice
public class APIExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(CountryNotFoundException.class)
	public ResponseEntity<Object> handleCountryNotFound(WebRequest request, CountryNotFoundException ex, HttpServletRequest req){
		var status = HttpStatus.NOT_FOUND;
		
		Problem problem = new Problem(OffsetDateTime.now(), status.value(), "Country with this id was not found", ex.getMessage(), req.getRequestURI());
		
		return handleExceptionInternal(ex, problem, new HttpHeaders(), status, request);
	}
}
