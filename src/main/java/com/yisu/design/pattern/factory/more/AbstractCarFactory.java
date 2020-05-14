package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.BenChiCar;
import com.yisu.design.pattern.factory.normal.Car;

/**
 * @author xuyisu
 * @description 汽车的抽象工厂
 * @date 2020/5/14
 */
public abstract class AbstractCarFactory {
    public abstract  Car createCar();
}
