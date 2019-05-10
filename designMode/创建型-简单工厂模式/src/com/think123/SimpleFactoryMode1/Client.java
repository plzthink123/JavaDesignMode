package com.think123.SimpleFactoryMode1;

public class Client {
    public static void main(String[] args) {
        loginMethod("name");
    }
    public static void loginMethod(String type){
        String name="name";
        String password="password";
        Login login = simpleFactory.factory(type);
        boolean b = login.verfiy(name, password);
        if(b){
            System.out.println("success!");
        }else{
            System.out.println("failed");
        }
    }
}