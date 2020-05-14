package com.yisu.design.pattern.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 奔驰车模型
 * @date 2020/5/14
 */
@Slf4j
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        log.info("奔驰车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        log.info("奔驰车应该这样停车......");
    }

    @Override
    protected void alarm() {
        log.info("奔驰车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        log.info("奔驰车的引擎是这个声音的");
    }
}
