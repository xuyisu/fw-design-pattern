package com.yisu.design.pattern.singleton;

/**
 * 单利模式-饿汉式
 */
public class SingletonEmperorHungry {

    private static final SingletonEmperorHungry emperor =new SingletonEmperorHungry(); //初始化一个皇帝
    private SingletonEmperorHungry(){
        //目的就是不希望产生第二个皇帝
    }
    public static SingletonEmperorHungry getInstance(){
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝....");
    }
}
