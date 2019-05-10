package com.think123.SimpleFactoryMode2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            String next = sc.next();
            if(next.equalsIgnoreCase("apple")){
                FruitFactory fruitFactory=new AppleFacotry();
                Fruit apple = fruitFactory.factory();
                apple.grow();
            }else if(next.equalsIgnoreCase("banan")){
                FruitFactory fruitFactory=new BnanaFacotry();
                Fruit banan = fruitFactory.factory();
                banan.sale();
            }
            if(next.equalsIgnoreCase("bye")){
                System.out.println("bye!");
                System.exit(0);
            }
        }
    }
}