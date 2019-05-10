package com.think123.Builder;

/**
 * Director
 * 指挥者类
 * 构建一个使用Builder接口的对象,主要用于创建一个复杂对象:
 *  1.隔离了客户与对象生产过程
 *  2.负责控制产品对象的生产过程
 */
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public  KFCWaiter(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }

    public Meal construct(){
        //准备食物
        mealBuilder.buildFood();
        //准备饮料
        mealBuilder.buildDrink();
        //准备完毕,返回套餐给客户
        return mealBuilder.getMeal();
    }
}