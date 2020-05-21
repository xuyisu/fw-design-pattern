package com.yisu.design.pattern.strategy;

/**
 * @author xuyisu
 * @description 锦囊
 * @date 2020/5/21
 */
public class Context {
    //构造函数，你要使用哪个妙计
    private IStrategy straegy;
    public Context(IStrategy strategy){
        this.straegy = strategy;
    }
    //使用计谋了，看我出招了
    public void operate(){
        this.straegy.operate();
    }
}
