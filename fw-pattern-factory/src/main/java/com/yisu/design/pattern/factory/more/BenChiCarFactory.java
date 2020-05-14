package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.BenChiCar;

/**
 * @author xuyisu
 * @description 升级为多个工厂类 -奔驰车工厂
 * @date 2020/5/14
 */
public class BenChiCarFactory extends AbstractCarFactory {

    public BenChiCar createCar() {
        return new BenChiCar();
    }
}
