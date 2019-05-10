package com.think123.对象Adapter;

public class Client {
    public static void main(String[] args) {
       new Client().test();
    }
    public void test(){
        Adaptee adaptee=new Adaptee();
        OAdapter oadapter = new OAdapter(adaptee);
        int before = oadapter.get220v();
        System.out.println("转换之前:"+before);
        int after = oadapter.get100v();
        System.out.println("转换之后:"+after);
    }
}