package com.yisu.design.pattern.factory.normal;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 工厂类
 * @date 2020/5/14
 */
@Slf4j
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的
        Human human =null;
        try {
        //产生一个人种
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            log.info("人类创建错误！");
        }
        return (T) human;
    }
}
