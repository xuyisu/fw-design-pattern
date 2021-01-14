package com.yisu.design.pattern.observer;

/**
 * @author xuyisu
 * @description 具体被观察者
 * @date 2021/1/14
 */
public class ConcreteSubject extends Subject{
    //具体的业务
    public void doSomething(){
        /*
         * do something
         */
        super.notifyObservers();
    }
}
