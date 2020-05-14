package com.yisu.design.pattern.factory;

import com.yisu.design.pattern.factory.lazyinitialization.LazyCarSimpleFactory;
import com.yisu.design.pattern.factory.more.BaoMaCarFactory;
import com.yisu.design.pattern.factory.more.BenChiCarFactory;
import com.yisu.design.pattern.factory.normal.*;
import com.yisu.design.pattern.factory.simple.CarSimpleFactory;
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
        //声明造车厂
        AbstractCarFactory carFactory = new CarFactory();
        //先生产宝马车
        log.info("--先造宝马车--");
        Car bmCar = carFactory.createCar(BaoMaCar.class);
        bmCar.getColor();
        bmCar.run();

        //第二批生产奔驰车
        log.info("--第二批生产奔驰车--");
        Car bcCar = carFactory.createCar(BenChiCar.class);
        bcCar.getColor();
        bcCar.run();
    }

    /**
     * 测试简单工厂
     */
    @Test
    public  void  testSimpeFactory(){
        //先生产宝马车
        log.info("--先造宝马车--");
        Car bmCar = CarSimpleFactory.createCar(BaoMaCar.class);
        bmCar.getColor();
        bmCar.run();

        //第二批生产奔驰车
        log.info("--第二批生产奔驰车--");
        Car bcCar = CarSimpleFactory.createCar(BenChiCar.class);
        bcCar.getColor();
        bcCar.run();
    }

    /**
     * 测试 升级为多个工厂类
     */
    @Test
    public  void  testMoreFactory(){
        //先生产宝马车
        log.info("--先造宝马车--");
        Car bmCar = (new BaoMaCarFactory()).createCar();
        bmCar.getColor();
        bmCar.run();

        //第二批生产奔驰车
        log.info("--第二批生产奔驰车--");
        Car bcCar = (new BenChiCarFactory()).createCar();
        bcCar.getColor();
        bcCar.run();
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
        //先生产宝马车
        log.info("--先造宝马车--");
        Car bmCar = LazyCarSimpleFactory.createCar(BaoMaCar.class);
        bmCar.getColor();
        bmCar.run();

        //第二批生产奔驰车
        log.info("--第二批生产奔驰车--");
        Car bcCar = LazyCarSimpleFactory.createCar(BenChiCar.class);
        bcCar.getColor();
        bcCar.run();
    }
}
