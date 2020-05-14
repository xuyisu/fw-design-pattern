package com.yisu.design.pattern.singleton;

/**
 * @author xuyisu
 * @description 单利模式-饿汉式
 * @date 2020/5/14
 */
public class EmperorHungrySingleton {

    private static final EmperorHungrySingleton emperor =new EmperorHungrySingleton(); //初始化一个皇帝
    private EmperorHungrySingleton(){
        //目的就是不希望产生第二个皇帝
    }
    public static EmperorHungrySingleton getInstance(){
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝....");
    }
}
