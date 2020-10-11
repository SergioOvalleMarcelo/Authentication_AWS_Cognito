 package br.com.alelo.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourseExceptionHandler {
	@ExceptionHandler(WebClientException.class)
	public ResponseEntity<StandardError> errorCognito(WebClientException e, HttpServletRequest request) {
		StandardError error = new StandardError(HttpStatus.UNAUTHORIZED.value(), e.getMessage(),
				System.currentTimeMillis(), false);
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
	}	
}
