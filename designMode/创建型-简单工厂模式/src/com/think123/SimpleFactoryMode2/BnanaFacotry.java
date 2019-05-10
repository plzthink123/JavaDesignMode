package com.think123.SimpleFactoryMode2;

public class BnanaFacotry implements  FruitFactory {
    @Override
    public Fruit factory() {
        return new Banan();
    }
}