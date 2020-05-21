package com.yisu.design.pattern.strategy;

/**
 * @author xuyisu
 * @description 乔国老开后门
 * @date 2020/5/21
 */
public class BackDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
