package com.example.springboot.errorhandling;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
  
   @ExceptionHandler(Throwable.class)
   protected ResponseEntity<Object> handleException(Throwable e) {
       return new ResponseEntity<Object>("ERROR " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
   }
}