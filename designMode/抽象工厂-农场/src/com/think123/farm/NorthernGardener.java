package com.think123.farm;

public class NorthernGardener implements  Gardener {

    @Override
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    @Override
    public Veggie createVeggie(String name) {
        return new NorthernVeggie(name);
    }
}