package com.yisu.design.pattern.factory.simple;

import com.yisu.design.pattern.factory.normal.Human;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 简单工厂
 * @date 2020/5/14
 */
@Slf4j
public class HumanSimpleFactory {
    /**
     * 仅有两个地方发生变化：去掉继承抽象类，并在createHuman前增加static关键字
     */
    public static  <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的
        Human human =null;
        try {
            //产生一个人种
            //和 CarFactory 的 不同之处就在这一句
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            log.info("人类创建错误！");
        }
        return (T) human;
    }
}
