package com.yisu.design.pattern.observer;

import java.util.Vector;

/**
 * @author xuyisu
 * @description 观察者
 * @date 2021/1/14
 */
public abstract class Subject {

    //定义一个观察者数组
    private Vector<Observer> obsVector = new Vector<Observer>();
    //增加一个观察者
    public void addObserver(Observer o){
        this.obsVector.add(o);
    }
    //删除一个观察者
    public void delObserver(Observer o){
        this.obsVector.remove(o);
    }
    //通知所有观察者
    public void notifyObservers(){
        for(Observer o:this.obsVector){
            o.update();
        }
    }
}
