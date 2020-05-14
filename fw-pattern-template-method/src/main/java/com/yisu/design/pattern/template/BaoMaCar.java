package com.yisu.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 宝马业务处理
 * @date 2020/5/14
 */
@Slf4j
public class BaoMaCar extends AbstractCar {
    @Override
    protected void startCar() {
        log.info("宝马车要启动了");
    }

    @Override
    protected void runCar() {
        log.info("宝马车要开走了");
    }
}
