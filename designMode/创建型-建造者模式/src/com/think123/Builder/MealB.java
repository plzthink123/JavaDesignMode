package com.think123.Builder;

public class MealB extends  MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
        System.out.println("汉堡....build");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("奶昔");
        System.out.println("奶昔...build");
    }
}