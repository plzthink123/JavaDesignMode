package com.think123.AbstractFactory1;

public class mysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new mysqlUser();
    }

    @Override
    public IAccount createAccount() {
        return new mysqlAccount();
    }
}