package com.yisu.design.pattern.factory;

/**
 * @author xuyisu
 * @description 汽车的抽象工厂
 * @date 2020/5/14
 */
public abstract class AbstractCarFactory {
    public abstract <T extends Car> T createCar(Class<T> c);
}
