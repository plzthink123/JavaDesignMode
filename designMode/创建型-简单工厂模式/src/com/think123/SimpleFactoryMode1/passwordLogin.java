package com.think123.SimpleFactoryMode1;

public class passwordLogin implements Login {
    @Override
    public boolean verfiy(String name, String password) {
        System.out.println("password");
        return true;
    }
}