package com.yisu.design.pattern.abfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 黑人男性
 * @date 2020/5/14
 */
@Slf4j
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        log.info("黑人男性");
    }
}