package com.yisu.design.pattern.mediator;

import org.junit.Test;


/**
 * @author xuyisu
 * @description 原型模式测试
 * @date 2020/5/14
 */
public class TestMediator {

    @Test
    public void testMediator() {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
