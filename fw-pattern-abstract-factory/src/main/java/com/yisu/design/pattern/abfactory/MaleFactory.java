package com.yisu.design.pattern.abfactory;

/**
 * @author xuyisu
 * @description 生产男性工厂
 * @date 2020/5/14
 */
public class MaleFactory implements HumanFactory {
    //生产出白人男性
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    //生产出黑人男性
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
