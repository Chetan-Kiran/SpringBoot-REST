package com.example.demo.services;

public class product {
    private int id;
    private String name;
    private int cost;

    public product(int id,String name,int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getCost(){
        return cost;
    }
}
