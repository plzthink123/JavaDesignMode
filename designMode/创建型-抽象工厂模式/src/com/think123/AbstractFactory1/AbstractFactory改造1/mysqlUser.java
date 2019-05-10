package com.think123.AbstractFactory1.AbstractFactory改造1;

public class mysqlUser implements IUser {
    @Override
    public void insert() {
        System.out.println("mysql....insert");
    }

    @Override
    public User getUser(int id) {
        System.out.println(" get user(uid) in mysql ");
        return null;
    }
}