package com.yisu.design.pattern.template;

import org.junit.Test;

/**
 * @author xuyisu
 * @description 模板方法测试
 * @date 2020/5/14
 */
public class templateTest {

    @Test
    public void templateTest(){
        AbstractCar benChiCar=new BenChiCar();
        AbstractCar baoMaCar=new BaoMaCar();
        benChiCar.templateCar();
        baoMaCar.templateCar();
    }
}
