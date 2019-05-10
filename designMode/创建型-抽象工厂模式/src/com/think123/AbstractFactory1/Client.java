package com.think123.AbstractFactory1;

public class Client {
    public static void main(String[] args) {
        User user=new User();
        Account account=new Account();
        //测试mysql工厂类

        //只需要确定实例化哪一个数据库访问对象刚给Factory
        IFactory iFactory=new mysqlFactory();
        IUser user1 = iFactory.createUser();
        user1.getUser(1);
        //已经于具体的数据库实现解耦
        IAccount account1 = iFactory.createAccount();
        account1.getAccount();
    }
}