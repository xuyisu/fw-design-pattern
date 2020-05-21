package com.yisu.design.pattern.mediator;

/**
 * @author xuyisu
 * @description //抽象同事类
 * @date 2020/5/21
 */
public class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
