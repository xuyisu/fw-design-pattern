package com.yisu.design.pattern.abfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 白人抽象类
 * @date 2020/5/14
 */
@Slf4j
public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        log.info("白色人种的皮肤颜色是白色的！");
    }

    public void talk() {
        log.info("这个白人说话不清楚！");
    }

}
