package com.think123.AbstractFactory1;

public class mysqlAccount implements IAccount {
    @Override
    public void getAccount() {
        System.out.println("mysql getAccount...");
    }

    @Override
    public void del() {
        System.out.println("mysql delete Account...");
    }
}