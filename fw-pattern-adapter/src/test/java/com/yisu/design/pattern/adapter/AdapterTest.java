package com.yisu.design.pattern.adapter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 工厂模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class AdapterTest {

    @Test
    public  void  testAdapter(){
        //没有与外系统连接的时候，是这样写的
//        IUserInfo youngGirl = new UserInfo();
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查到101个
        for(int i=0;i<101;i++){
            youngGirl.getMobileNumber();
        }
    }

}
