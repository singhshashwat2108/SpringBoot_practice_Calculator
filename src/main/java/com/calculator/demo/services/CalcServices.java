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
  
  public double add(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");

    Number n= new Number();
    n.setA(a);
    n.setB(b);
    n.setOperation("Add");
    n.setResult(a+b);
    repo.save(n);
    return a+b;
  }

  public double sub(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");

    Number n= new Number();
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

    Number n= new Number();
    n.setA(a);
    n.setB(b);
    n.setOperation("Mul");
    n.setResult(a*b);
    repo.save(n);
    return a*b;
  }

  public double div(double a,double b){
    if(a<0 || b<0) throw new ArithmeticException("Negative values not allowed");

    Number n= new Number();                      //write the object of the entity in the function so that new obejects are created and the data is stored in different rows, as making the object outside the service class will have the same id, so same row will be updated.
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

