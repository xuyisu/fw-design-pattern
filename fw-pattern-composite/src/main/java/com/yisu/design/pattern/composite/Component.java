package com.yisu.design.pattern.composite;

/**
 * @author xuyisu
 * @description 组合模式
 * @date 2021/1/14
 */
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
    //编写业务逻辑
        System.out.println("ok");
    }
}
