package com.yisu.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description 单利模式-懒汉式
 * @date 2020/5/14
 */
@Slf4j
public class EmperorLazySingleton {

    private static EmperorLazySingleton emperor =null;
    private EmperorLazySingleton(){
        //目的就是不希望产生第二个皇帝
    }

    //处理线程安全问题
    public synchronized static EmperorLazySingleton getInstance(){
        if(emperor == null){
            emperor = new EmperorLazySingleton();
        }
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        log.info("我就是皇帝....");
    }
}
