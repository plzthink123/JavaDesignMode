package com.think123.SimpleFactoryMode1;

/**
 * 工厂角色
 */
public class simpleFactory {
    public static Login factory(String type){
        if(type.equalsIgnoreCase("name")){
            return new nameLogin();
        }else if(type.equalsIgnoreCase("password")){
            return new passwordLogin();
        }else{
            throw  new RuntimeException("no type can be found!");
        }
    }
}