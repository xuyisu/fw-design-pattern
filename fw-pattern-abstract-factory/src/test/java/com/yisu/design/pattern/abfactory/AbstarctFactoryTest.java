package com.yisu.design.pattern.abfactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 抽象工厂测试类
 * @date 2020/5/14
 */
@Slf4j
public class AbstarctFactoryTest {

    @Test
    public void testAbstarctFactory(){
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生产人了:

        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();

        log.info("---生产一个白色女性---");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();


        log.info("---生产一个黑色男性---");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
    }

}
