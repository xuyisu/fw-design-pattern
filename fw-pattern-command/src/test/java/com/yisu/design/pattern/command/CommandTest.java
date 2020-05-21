package com.yisu.design.pattern.command;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 工厂模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class CommandTest {

    @Test
    public  void  testCommand(){
        //定义我们的接头人
        Invoker xiaoSan = new Invoker(); //接头人就是小三
        //客户要求增加一项需求
        System.out.println("------------客户要求增加一项需求---------------");
        //客户给我们下命令来
        //Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        //接头人接收到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }

}
