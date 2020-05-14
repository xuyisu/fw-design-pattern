package com.yisu.design.pattern.factory;

import org.junit.Test;

/**
 * @author xuyisu
 * @description 工厂模式单元测试
 * @date 2020/5/14
 */
public class FactoryTest {

    @Test
    public  void  testFactory(){
        //声明造车厂
        AbstractCarFactory carFactory = new CarFactory();
        //先生产宝马车
        System.out.println("--先造宝马车--");
        Car bmCar = carFactory.createCar(BaoMaCar.class);
        bmCar.getColor();
        bmCar.run();

        //第二批生产奔驰车
        System.out.println("--第二批生产奔驰车--");
        Car bcCar = carFactory.createCar(BenChiCar.class);
        bcCar.getColor();
        bcCar.run();
    }
}
