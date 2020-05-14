package com.yisu.design.pattern.factory.normal;

/**
 * @author xuyisu
 * @description 宝马车实现类
 * @date 2020-05-14
 */
public class BaoMaCar implements Car {
    @Override
    public void getColor() {
        System.out.println("这个宝马是黑色的！");
    }

    @Override
    public void run() {
        System.out.println("这个宝马提速真快！");
    }
}
