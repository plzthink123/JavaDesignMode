package com.think123.singleton;

/**
 * 懒汉式(线程安全，同步方法) [不推荐用]
 *
 * 优点: 针对一般懒汉式做了线程同步,可以再多线程环境下使用
 *
 * 缺点: 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 *      而其实这个方法只执行一次实例化代码就够了，
 *      后面的想获得该类实例，直接return就行了。
 *      方法进行同步效率太低要改进
 */
public class singleton4 {
    private  static singleton4 instance;

    private singleton4(){}

    public static synchronized singleton4 getInstance(){
        if(instance==null){
            instance= new singleton4();
        }
        return instance;
    }
}