package com.yisu.design.pattern.factory.lazyinitialization;

import com.yisu.design.pattern.factory.normal.Human;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuyisu
 * @description 延迟加载的工厂类
 * @date 2020/5/14
 */
@Slf4j
public class LazyHumanSimpleFactory {

    private static final Map<String, Human> prMap = new HashMap();

    /**
     * LazyCarSimpleFactory负责产品类对象的创建工作，并且通过prMap变量产生一个缓存，对需要
     * 再次被重用的对象保留
     */
    public static synchronized Human createHuman(Class c)  {
        //定义一个生产的
        Human human =null;
        //如果Map中已经有这个对象
        if(prMap.containsKey(c.getName())){
            human = prMap.get(c.getName());
        }else{
            try {
                human = (Human)Class.forName(c.getName()).newInstance();
                //同时把对象放到缓存容器中
                prMap.put(c.getName(), human);
            }catch (Exception e){
                log.error(e.getMessage());
            }

        }
        return human;
    }
}
