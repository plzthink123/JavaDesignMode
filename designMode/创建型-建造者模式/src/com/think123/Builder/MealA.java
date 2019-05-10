package com.think123.Builder;

public class MealA extends  MealBuilder {
    @Override
    public void buildFood() {
        System.out.println("薯条....build");
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
        System.out.println("可乐...build");
    }
}