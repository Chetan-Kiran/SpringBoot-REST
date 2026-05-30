package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class serivce {
    List<product> li = new ArrayList<>();

    {
        li.add(new product(101, "laptop", 50000));
        li.add(new product(103, "RAM", 5000));
        li.add(new product(102, "Mobile", 25000));
    }

    public List<product> getproduct(){
        return li;
    }

    public product getsingleproduct(int id){
        product prod = null;
        for(product i : li){
            if(i.getId() == id){
                prod = i;
                break;
            }
        }
        return prod;
    }
}
