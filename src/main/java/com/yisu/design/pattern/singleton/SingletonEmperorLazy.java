package com.yisu.design.pattern.singleton;

/**
 * 单利模式-懒汉式
 */
public class SingletonEmperorLazy {

    private static  SingletonEmperorLazy emperor =null;
    private SingletonEmperorLazy(){
        //目的就是不希望产生第二个皇帝
    }

    //处理线程安全问题
    public synchronized static SingletonEmperorLazy getInstance(){
        if(emperor == null){
            emperor = new SingletonEmperorLazy();
        }
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝....");
    }
}
