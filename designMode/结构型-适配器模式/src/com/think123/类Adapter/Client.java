package com.think123.类Adapter;

public class Client {
    public static void main(String[] args) {
       new Client().test();
    }
    public void test(){
        Adapter adapter = new Adapter();
        int before = adapter.get220v();
        System.out.println("转换之前:"+before);
        int after = adapter.get100v();
        System.out.println("转换之后:"+after);
    }
}