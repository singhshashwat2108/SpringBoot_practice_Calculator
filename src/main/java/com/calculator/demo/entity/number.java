package com.calculator.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="calculation")
public class Number {

  @Id                     //to make primary key
  @GeneratedValue(strategy=GenerationType.IDENTITY)     // to tell db to auto generate IDs
  private int id;
  private double a;
  private double b;
  private String operation;
  private double result;

    public double getA() {
        return a;
    }

    public void setA(double a) {
      this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
      this.b = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
  }
