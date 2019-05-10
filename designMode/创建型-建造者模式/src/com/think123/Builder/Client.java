package com.think123.Builder;

/**
 * test客户端类
 */
public class Client {
    public static void main(String[] args) {
        MealA a=new MealA();
        //准备套餐A的服务员
        KFCWaiter waiter=new KFCWaiter(a);
        //获得套餐:
        Meal mealA=waiter.construct();
        System.out.print("套餐A的组成:");
        System.out.println("    -食物:"+mealA.getFood()+"----"+"饮品:"+mealA.getDrink()+"-");
    }
}