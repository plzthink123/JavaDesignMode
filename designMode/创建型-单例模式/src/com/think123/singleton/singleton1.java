package com.think123.singleton;

/**
 * 饿汉式:(静态常量)[可用]
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 *
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class singleton1 {
    //类加载即创建唯一实例
    private static singleton1 INSTANCE=new singleton1();
    //构造方法私有化
    private singleton1(){

    }
    //getInstance方法
    public static singleton1 getInstance(){
        return INSTANCE;
    }
}