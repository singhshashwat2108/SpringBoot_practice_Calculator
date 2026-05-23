package com.calculator.demo.controller;

import com.calculator.demo.entity.Number;
import com.calculator.demo.services.CalcServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class readinput {

    public  CalcServices calc;
    public readinput(CalcServices service){
        calc= service;
    }

    public Number num;
    @GetMapping("/")
    public String read(){
        return "This is a calculator API";
    }

    @PostMapping("/add")
    public double addnum(@RequestBody Number num){
        return calc.add(num.getA(),num.getB());
    }

    @PostMapping("/sub")
    public double subnum(@RequestBody Number num){
        return calc.sub(num.getA(),num.getB());
    }

    @PostMapping("/mul")
    public double mulnum(@RequestBody Number num){
        return calc.mul(num.getA(),num.getB());
    }

    @PostMapping("/div")
    public double divnum(@RequestBody Number num){
        return calc.div(num.getA(),num.getB());
    }
}

