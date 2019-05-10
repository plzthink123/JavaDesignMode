package com.think123.对象Adapter;

/**
 * 类的适配器角色:扩展源角色,实现目标角色,从而使得当目标角色改动时,不用改动元角色,只需改动适配器
 */
public class OAdapter implements Target {

    Adaptee adaptee=new Adaptee();
    public OAdapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }
    @Override
    public int get100v() {
        return adaptee.get100v();
    }

    public int get220v() {
        int v = adaptee.get100v();
        v=v*2;
        return v;
    }
}