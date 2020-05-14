package com.yisu.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class SingletonTest {

    @Test
    public void testSingletonHungry(){
        SingletonEmperorHungry emperor=SingletonEmperorHungry.getInstance();
        emperor.say();

    }

    @Test
    public void testSingletonLazy(){
        SingletonEmperorLazy emperor=SingletonEmperorLazy.getInstance();
        emperor.say();

    }
}
