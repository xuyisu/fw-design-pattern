package com.yisu.design.pattern.factory.normal;

/**
 * @author xuyisu
 * @description 工厂类
 * @date 2020/5/14
 */
public class CarFactory extends  AbstractCarFactory {
    @Override
    public <T extends Car> T createCar(Class<T> c) {
        //定义一个生产的车
        Car car=null;
        try {
        //产生一个人种
            car = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("汽车创建错误！");
        }
        return (T)car;
    }
}
