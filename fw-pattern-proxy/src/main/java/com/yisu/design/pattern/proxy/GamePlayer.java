package com.yisu.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyisu
 * @description //TODO
 * @date 2020/5/14
 */
@Slf4j
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //通过构造函数传递名称
    public GamePlayer(String _name){
        this.name = _name;
    }
    //打怪，最期望的就是杀老怪
    public void killBoss() {
        log.info(this.name + "在打怪！");
    }
    //进游戏之前你肯定要登录吧，这是一个必要条件
    public void login(String user, String password) {
        log.info("登录名为"+user+"的用户"+this.name+"登录成功！");
    }
    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    public void upgrade() {
        log.info(this.name + " 又升了一级！");
    }
}
