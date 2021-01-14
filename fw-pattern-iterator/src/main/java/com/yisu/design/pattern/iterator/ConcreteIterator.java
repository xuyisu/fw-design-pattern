package com.yisu.design.pattern.iterator;

import java.util.Vector;

/**
 * @author xuyisu
 * @description 迭代器
 * @date 2021/1/14
 */
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();
    /**
     * 定义当前游标
     */
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
