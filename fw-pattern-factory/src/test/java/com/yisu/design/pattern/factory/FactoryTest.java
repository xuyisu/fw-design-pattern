package com.yisu.design.pattern.factory;

import com.yisu.design.pattern.factory.lazyinitialization.LazyHumanSimpleFactory;
import com.yisu.design.pattern.factory.more.BlackHumanFactory;
import com.yisu.design.pattern.factory.more.WhiteHumanFactory;
import com.yisu.design.pattern.factory.normal.*;
import com.yisu.design.pattern.factory.simple.HumanSimpleFactory;
import com.yisu.design.pattern.factory.singleton.SingletonFactory;
import com.yisu.design.pattern.singleton.EmperorHungrySingleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 工厂模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class FactoryTest {

    @Test
    public  void  testFactory(){
        //声明造厂
        AbstractHumanFactory carFactory = new HumanFactory();
        //先生产黑人
        log.info("--先造黑人--");
        Human bmHuman = carFactory.createHuman(BlackHuman.class);
        bmHuman.getColor();
        bmHuman.talk();

        //第二批生产白人
        log.info("--第二批生产白人--");
        Human bcHuman = carFactory.createHuman(WhiteHuman.class);
        bcHuman.getColor();
        bcHuman.talk();
    }

    /**
     * 测试简单工厂
     */
    @Test
    public  void  testSimpeFactory(){
        //先生产黑人
        log.info("--先造黑人--");
        Human bmHuman = HumanSimpleFactory.createHuman(BlackHuman.class);
        bmHuman.getColor();
        bmHuman.talk();

        //第二批生产白人
        log.info("--第二批生产白人--");
        Human bcHuman = HumanSimpleFactory.createHuman(WhiteHuman.class);
        bcHuman.getColor();
        bcHuman.talk();
    }

    /**
     * 测试 升级为多个工厂类
     */
    @Test
    public  void  testMoreFactory(){
        //先生产黑人
        log.info("--先造黑人--");
        Human bmHuman = (new BlackHumanFactory()).createHuman();
        bmHuman.getColor();
        bmHuman.talk();

        //第二批生产白人
        log.info("--第二批生产白人--");
        Human bcHuman = (new WhiteHumanFactory()).createHuman();
        bcHuman.getColor();
        bcHuman.talk();
    }

    /**
     * 测试 替代单例模式
     */
    @Test
    public void testSingletonFactory(){
        EmperorHungrySingleton emperor= SingletonFactory.getSingleton();
        emperor.say();

    }

    /**
     * 测试简单工厂
     */
    @Test
    public  void  testLazySimpeFactory(){
        //先生产黑人
        log.info("--先造黑人--");
        Human bmHuman = LazyHumanSimpleFactory.createHuman(BlackHuman.class);
        bmHuman.getColor();
        bmHuman.talk();

        //第二批生产白人
        log.info("--第二批生产白人--");
        Human bcHuman = LazyHumanSimpleFactory.createHuman(WhiteHuman.class);
        bcHuman.getColor();
        bcHuman.talk();
    }
}
