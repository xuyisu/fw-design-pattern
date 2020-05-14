package com.yisu.design.pattern.abfactory;

/**
 * @author xuyisu
 * @description 人类创建工厂
 * @date 2020-05-14
 */
public interface HumanFactory {
    //制造一个白色人种
     Human createWhiteHuman();
    //制造一个黑色人种
     Human createBlackHuman();
}
