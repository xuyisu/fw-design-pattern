package com.yisu.design.pattern.strategy;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 策略模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class StrategyTest {

    @Test
    public  void  testStrategy(){
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行了第二个锦囊
        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
    }

}
