package com.yisu.design.pattern.abfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 白人男性
 * @date 2020/5/14
 */
@Slf4j
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        log.info("白人男性");
    }
}