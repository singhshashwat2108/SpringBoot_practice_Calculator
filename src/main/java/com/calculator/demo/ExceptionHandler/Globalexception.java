package com.calculator.demo.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globalexception {
  
  @ExceptionHandler(ArithmeticException.class)
  public String handleArithmetic(ArithmeticException word){
    return word.getMessage();
  }
  
}
