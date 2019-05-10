package com.think123.AbstractFactory1.AbstractFactory改造2;

public class oracleUser implements IUser {
    @Override
    public void insert() {
        System.out.println("oracle....insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println(" get user(uid) in oracle ");
        return null;
    }
}