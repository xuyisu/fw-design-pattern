package com.yisu.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 奔驰业务处理
 * @date 2020/5/14
 */
@Slf4j
public class BenChiCar extends AbstractCar {
    @Override
    protected void startCar() {
        log.info("奔驰车要启动了");
    }

    @Override
    protected void runCar() {
        log.info("奔驰车要开走了");
    }
}
