package com.think123.DefaultAdapter;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String i;
        char c;
        鲁智深 鲁智深=new 鲁智深();
        System.out.println(鲁智深.getName());
        System.out.println("请驶入A~E,不区分大小写,其他字符退出:");
        Scanner sc;
        while(true){
            sc=new Scanner(System.in);
            i=sc.next();
             c = i.charAt(0);
             鲁智深.习武(c);
        }
    }
}