package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.Human;

/**
 * @author xuyisu
 * @description 人类的抽象工厂
 * @date 2020/5/14
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
