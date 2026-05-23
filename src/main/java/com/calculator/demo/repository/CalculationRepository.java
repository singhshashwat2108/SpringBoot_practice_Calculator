package com.calculator.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculator.demo.entity.Number;

public interface CalculationRepository extends JpaRepository<Number,Integer> {
  
}
