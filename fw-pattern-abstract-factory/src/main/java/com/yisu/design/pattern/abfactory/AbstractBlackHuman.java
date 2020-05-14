package com.yisu.design.pattern.abfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 黑人抽象类
 * @date 2020/5/14
 */
@Slf4j
public abstract class AbstractBlackHuman implements Human{

    public void getColor() {
        log.info("黑色人种的皮肤颜色是黑色的！");
    }

    public void talk() {
        log.info("这个黑人说话很快！");
    }
}
