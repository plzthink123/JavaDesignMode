package com.think123.FactoryMethod1;

public class Client {
    public static void main(String[] args) {
        String data="";
        //构建
        ExportFactory exportFactory=new ExportPDFfactory();
        ExportFile file = exportFactory.factory("standard");
        //强制类型转换
        file.export(data);
        System.out.println("file = " + file);
    }
}