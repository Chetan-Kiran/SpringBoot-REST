package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.services.product;
import com.example.demo.services.serivce;

@RestController
@RequestMapping("/products")
public class controll {

    @Autowired
    private serivce serivce;
    
    @GetMapping
    public List<product> getproduct(){
        return serivce.getproduct();
    }

    @GetMapping("/{id}")
    public product getoneproduct(@PathVariable int id){
        return serivce.getsingleproduct(id);
    }
}
