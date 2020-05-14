package com.yisu.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


/**
 * @author xuyisu
 * @description 单例模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class SingletonTest {

    @Test
    public void testSingletonHungry(){
        EmperorHungrySingleton emperor= EmperorHungrySingleton.getInstance();
        emperor.say();

    }

    @Test
    public void testSingletonLazy(){
        EmperorLazySingleton emperor= EmperorLazySingleton.getInstance();
        emperor.say();

    }
}
