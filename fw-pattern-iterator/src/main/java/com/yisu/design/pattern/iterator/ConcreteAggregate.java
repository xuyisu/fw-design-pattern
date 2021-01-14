package com.yisu.design.pattern.iterator;

import java.util.Vector;

/**
 * @author xuyisu
 * @description //TODO
 * @date 2021/1/14
 */
public class ConcreteAggregate implements  Aggregate{

    //容纳对象的容器
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
