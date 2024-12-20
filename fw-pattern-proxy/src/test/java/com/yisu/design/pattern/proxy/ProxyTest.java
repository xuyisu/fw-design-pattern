package com.yisu.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 代理模式测试
 * @date 2020/5/14
 */
@Slf4j
public class ProxyTest {

    @Test
    public void testProxy(){
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
        //开始打游戏，记下时间戳
        log.info("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        log.info("结束时间是：2009-8-26 03:40");
    }
}
