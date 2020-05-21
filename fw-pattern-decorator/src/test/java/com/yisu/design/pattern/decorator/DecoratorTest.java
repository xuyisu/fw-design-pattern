package com.yisu.design.pattern.decorator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xuyisu
 * @description 工厂模式单元测试
 * @date 2020/5/14
 */
@Slf4j
public class DecoratorTest {

    @Test
    public  void  testCommand(){
        //把成绩单拿过来
        SchoolReport sr;
        //原装的成绩单
        sr = new FouthGradeSchoolReport();
        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        //又加了成绩排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        //然后老爸一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }

}
