package com.think123.SimpleFactoryMode2;

public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("apple grow...");
    }

    @Override
    public void sale() {
        System.out.println("apple sale 300$");
    }
}