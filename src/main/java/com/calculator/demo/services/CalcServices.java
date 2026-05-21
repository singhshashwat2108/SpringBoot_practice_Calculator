package com.calculator.demo.services;

import org.springframework.stereotype.Service;

@Service
public class CalcServices {
  
  public double add(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    return a+b;
  }

  public double sub(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    if(a>b) return a-b;
    else return b-a;
  }

  public double mul(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    return a*b;
  }

  public double div(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    if(a>b)  return a/b;
    else  return b/a;
  }
}

