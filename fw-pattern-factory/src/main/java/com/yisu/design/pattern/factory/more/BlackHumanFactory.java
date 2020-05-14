package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.BlackHuman;

/**
 * @author xuyisu
 * @description 升级为多个工厂类 -黑人工厂
 * @date 2020/5/14
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    public BlackHuman createHuman() {
        return new BlackHuman();
    }
}
