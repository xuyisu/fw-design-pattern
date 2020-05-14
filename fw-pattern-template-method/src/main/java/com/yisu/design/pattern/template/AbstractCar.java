package com.yisu.design.pattern.template;

/**
 * @author xuyisu
 * @description 汽车抽象类
 * @date 2020/5/14
 */
public abstract class AbstractCar {

    // 启动汽车
    protected abstract void startCar();
    // 把汽车开走
    protected abstract void runCar();

    //模板方法
    public void templateCar(){
        this.startCar();
        this.runCar();
    }
}
