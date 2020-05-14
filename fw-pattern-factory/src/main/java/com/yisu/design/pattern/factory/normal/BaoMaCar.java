package com.yisu.design.pattern.factory.normal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 宝马车实现类
 * @date 2020-05-14
 */
@Slf4j
public class BaoMaCar implements Car {
    @Override
    public void getColor() {
        log.info("这个宝马是黑色的！");
    }

    @Override
    public void run() {
        log.info("这个宝马提速真快！");
    }
}
