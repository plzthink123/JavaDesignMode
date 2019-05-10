package com.think123.AbstractFactory1;

public class oracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new oracleUser();
    }

    @Override
    public IAccount createAccount() {
        return new oracleAccount();
    }
}