package com.think123.SimpleFactoryMode2;

public class AppleFacotry implements  FruitFactory {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}