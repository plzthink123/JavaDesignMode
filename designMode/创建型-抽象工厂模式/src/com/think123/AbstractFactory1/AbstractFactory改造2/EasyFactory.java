package com.think123.AbstractFactory1.AbstractFactory改造2;

public class EasyFactory {
    private static String packName = "com.think123.AbstractFactory1.AbstractFactory改造2";
    private static String sqlName = "mysql";

    public static IUser createUser() throws Exception{
        String className = packName+"."+sqlName+"User";
        return (IUser)Class.forName(className).newInstance();
    }

    public static IAccount createAccount() throws Exception{
        String className = packName+"."+sqlName+"Account";
        return (IAccount) Class.forName(className).newInstance();
    }

}