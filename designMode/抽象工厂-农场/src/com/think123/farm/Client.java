package com.think123.farm;

public class Client {
    public static void main(String[] args) {
        Fruit fruit1=new NorthernFruit("apple");
        Fruit fruit2=new TropicalFruit("orange");
        Veggie veggie1=new NorthernVeggie("rice");
        Veggie veggie2=new NorthernVeggie("wheat");
        System.out.println(((NorthernFruit) fruit1).getName()+((TropicalFruit) fruit2).getName()+((NorthernVeggie) veggie1).getName()+((NorthernVeggie) veggie2).getName());
    }
}