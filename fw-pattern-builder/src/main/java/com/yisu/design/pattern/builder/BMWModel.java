package com.yisu.design.pattern.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 宝马车模型
 * @date 2020/5/14
 */
@Slf4j
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        log.info("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        log.info("宝马车应该这样停车......");
    }

    @Override
    protected void alarm() {
        log.info("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        log.info("宝马车的引擎是这个声音的");
    }
}
