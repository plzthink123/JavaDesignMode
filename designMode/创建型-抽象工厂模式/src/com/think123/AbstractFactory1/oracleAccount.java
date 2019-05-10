package com.think123.AbstractFactory1;

public class oracleAccount implements IAccount {
    @Override
    public void getAccount() {
        System.out.println("oracle getAccount...");
    }

    @Override
    public void del() {
        System.out.println("oracle delete Account...");
    }
}