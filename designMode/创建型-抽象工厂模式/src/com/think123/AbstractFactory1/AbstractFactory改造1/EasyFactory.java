package com.think123.AbstractFactory1.AbstractFactory改造1;

public class EasyFactory {
    //数据库名称
    private static String db="mysql";
    //private static String db="oracle";
    public  static IUser createUser(){
        IUser user=null;
        switch (db){
            case "mysql":
                user=new mysqlUser();
            case "oracle":
                user= new oracle();
        }
        return user;
    }

    public static IAccount createAccount(){
        IAccount iAccount=null;
        switch (db){
            case "mysql":
                    iAccount=new mysqlAccount();
            case "oracle":
                    iAccount=new oracleAccount();
        }
        return iAccount;
    }
}