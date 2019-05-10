package com.think123.DefaultAdapter;

public class 鲁智深 extends 缺省适配器 {

    public void 习武(char c) {
        Character s=null;
        c=s.toUpperCase(c);
        switch (c){
            case 'A':
            System.out.println("拳打镇关西");
            break;
            case 'B':
            System.out.println("大闹五台山");
            break;
            case 'C':
            System.out.println("火烧瓦罐寺");
            break;
            default:{
            System.out.println("退出再见");
            System.exit(0);
            break;
            }
        }
    }

    @Override
    public String getName() {
        return "我是鲁智深";
    }
}