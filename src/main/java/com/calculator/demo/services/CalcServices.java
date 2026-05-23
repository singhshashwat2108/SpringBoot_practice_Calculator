package com.calculator.demo.services;

import org.springframework.stereotype.Service;

import com.calculator.demo.entity.Number;
import com.calculator.demo.repository.CalculationRepository;

@Service
public class CalcServices {

  public final CalculationRepository repo;
  public CalcServices(CalculationRepository repo){
    this.repo=repo;
  }

  Number n= new Number();
  
  public double add(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    n.setA(a);
    n.setB(b);
    n.setOperation("Add");
    n.setResult(a+b);
    repo.save(n);
    return a+b;
  }

  public double sub(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    if(a>b){
      n.setA(a);
      n.setB(b);
      n.setOperation("Sub");
      n.setResult(a-b);
      repo.save(n);
      return a-b;}

    else{
      n.setA(a);
      n.setB(b);
      n.setOperation("Sub");
      n.setResult(b-a);
      repo.save(n);
      return b-a;}
  }

  public double mul(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    n.setA(a);
    n.setB(b);
    n.setOperation("Mul");
    n.setResult(a*b);
    repo.save(n);
    return a*b;
  }

  public double div(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");
    if(a>b){
      n.setA(a);
      n.setB(b);
      n.setOperation("Div");
      n.setResult(b/a);
      repo.save(n);
      return b/a;
    } 
    else{
      n.setA(a);
      n.setB(b);
      n.setOperation("Div");
      n.setResult(a/b);
      repo.save(n);
      return a/b;}
  }
}

