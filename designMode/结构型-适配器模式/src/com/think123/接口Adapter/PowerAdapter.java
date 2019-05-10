package com.think123.接口Adapter;

/**
 * 这里抽象类其实就写了空方法，等着子类去实现需要的方法
 * 子类只需要重写父类中它关心的方法
 */
public  abstract  class PowerAdapter implements  DCOutPut {
    public AC220 ac=new AC220();
    public PowerAdapter(AC220 ac){
        this.ac=ac;
    }
    public int output5V() {
        return ac.outPut220();
    }

    public int output9V() {
        return ac.outPut220();
    }

    public int output12V() {
        return ac.outPut220();
    }

    public int output24V() {
        return ac.outPut220();
    }
}