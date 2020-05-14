package com.yisu.design.pattern.factory.singleton;

import com.yisu.design.pattern.singleton.EmperorHungrySingleton;

import java.lang.reflect.Constructor;

/**
 * @author xuyisu
 * @description 替代单例模式
 * @date 2020/5/14
 */
public class SingletonFactory {
    private static EmperorHungrySingleton singleton;
    static{
        try {
            Class cl= Class.forName(EmperorHungrySingleton.class.getName());
            //获得无参构造
            Constructor constructor=cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (EmperorHungrySingleton)constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }
    public static EmperorHungrySingleton getSingleton(){
        return singleton;
    }
}
