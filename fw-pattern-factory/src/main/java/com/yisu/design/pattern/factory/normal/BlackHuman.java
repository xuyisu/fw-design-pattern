package com.yisu.design.pattern.factory.normal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 黑人实现类
 * @date 2020-05-14
 */
@Slf4j
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        log.info("这个黑人是黑色的！");
    }

    @Override
    public void talk() {
        log.info("这个黑人说话真快！");
    }
}
