package com.yisu.design.pattern.abfactory;

/**
 * @author xuyisu
 * @description 生产女性工厂
 * @date 2020/5/14
 */
public class FemaleFactory implements HumanFactory {
    //生产出白人女性
    @Override
    public Human createWhiteHuman() {
        return new  FemaleWhiteHuman();
    }

    //生产出黑人女性
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
