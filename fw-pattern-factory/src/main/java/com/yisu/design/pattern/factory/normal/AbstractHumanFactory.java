package com.yisu.design.pattern.factory.normal;

/**
 * @author xuyisu
 * @description 人类的抽象工厂
 * @date 2020/5/14
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
