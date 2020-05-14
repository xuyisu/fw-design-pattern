package com.yisu.design.pattern.factory.normal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 白人实现类
 * @date 2020-05-14
 */
@Slf4j
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        log.info("这个白人是白色的！");
    }

    @Override
    public void talk() {
        log.info("这个白人说话不清楚！");
    }
}