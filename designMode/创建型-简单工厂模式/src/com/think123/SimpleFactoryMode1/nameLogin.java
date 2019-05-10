package com.think123.SimpleFactoryMode1;

public class nameLogin implements Login {
    @Override
    public boolean verfiy(String name, String password) {
        System.out.println("name");
        return true;
    }
}