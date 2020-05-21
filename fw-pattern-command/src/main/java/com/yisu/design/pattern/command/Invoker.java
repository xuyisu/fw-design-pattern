package com.yisu.design.pattern.command;

/**
 * @author xuyisu
 * @description //负责人
 * @date 2020/5/21
 */
public class Invoker {
    //什么命令
    private Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
