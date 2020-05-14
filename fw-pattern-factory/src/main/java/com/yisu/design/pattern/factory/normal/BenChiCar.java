package com.yisu.design.pattern.factory.normal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 奔驰车实现类
 * @date 2020-05-14
 */
@Slf4j
public class BenChiCar implements Car {
    @Override
    public void getColor() {
        log.info("这个奔驰是红色的！");
    }

    @Override
    public void run() {
        log.info("这个奔驰开起来很6！");
    }
}