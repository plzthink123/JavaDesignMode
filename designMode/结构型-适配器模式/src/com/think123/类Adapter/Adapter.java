package com.think123.类Adapter;

/**
 * 类的适配器角色:扩展源角色,实现目标角色,从而使得当目标角色改动时,不用改动元角色,只需改动适配器
 */
public class Adapter extends  Adaptee implements  Target {

    public int get220v() {
        return 0;
    }
}