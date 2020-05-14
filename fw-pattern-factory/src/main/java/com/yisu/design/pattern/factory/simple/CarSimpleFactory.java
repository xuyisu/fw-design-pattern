package com.yisu.design.pattern.factory.simple;

import com.yisu.design.pattern.factory.normal.Car;

/**
 * @author xuyisu
 * @description 简单工厂
 * @date 2020/5/14
 */
public class CarSimpleFactory {
    /**
     * 仅有两个地方发生变化：去掉继承抽象类，并在createHuman前增加static关键字
     */
    public static  <T extends Car> T createCar(Class<T> c) {
        //定义一个生产的车
        Car car=null;
        try {
            //产生一个人种
            //和 CarFactory 的 不同之处就在这一句
            car = (Car)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("汽车创建错误！");
        }
        return (T)car;
    }
}
