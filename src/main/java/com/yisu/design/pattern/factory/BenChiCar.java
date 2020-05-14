package com.yisu.design.pattern.factory;

/**
 * @author xuyisu
 * @description 奔驰车实现类
 * @date 2020-05-14
 */
public class BenChiCar implements Car {
    @Override
    public void getColor() {
        System.out.println("这个奔驰是红色的！");
    }

    @Override
    public void run() {
        System.out.println("这个奔驰开起来很6！");
    }
}