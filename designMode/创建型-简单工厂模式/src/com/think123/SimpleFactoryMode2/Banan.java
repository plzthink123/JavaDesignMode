package com.think123.SimpleFactoryMode2;

public class Banan implements Fruit {
    @Override
    public void grow() {
        System.out.println("banan grow...");
    }

    @Override
    public void sale() {
        System.out.println("banan sale 300$");
    }
}