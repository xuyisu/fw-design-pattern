package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.WhiteHuman;

/**
 * @author xuyisu
 * @description 升级为多个工厂类 -白人工厂
 * @date 2020/5/14
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    public WhiteHuman createHuman() {
        return new WhiteHuman();
    }
}
