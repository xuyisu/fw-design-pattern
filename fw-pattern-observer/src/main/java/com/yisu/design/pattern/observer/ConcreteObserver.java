package com.yisu.design.pattern.observer;

/**
 * @author xuyisu
 * @description 具体观察者
 * @date 2021/1/14
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
