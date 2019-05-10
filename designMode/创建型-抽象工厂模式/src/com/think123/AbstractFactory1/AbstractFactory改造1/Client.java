package com.think123.AbstractFactory1.AbstractFactory改造1;

public class Client {
    public static void main(String[] args) {
        User user=new User();
        Account account=new Account();
        //测试mysql工厂类
        IAccount account1 = EasyFactory.createAccount();
        account1.getAccount();
        account1.del();
    }
}