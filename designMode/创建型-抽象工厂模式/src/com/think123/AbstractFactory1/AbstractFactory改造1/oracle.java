package com.think123.AbstractFactory1.AbstractFactory改造1;

public class oracle implements IUser {
    @Override
    public void insert() {
        System.out.println("oracle....insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get user(udi) in oracle");
        return null;
    }
}