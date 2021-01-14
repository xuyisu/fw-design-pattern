package com.yisu.design.pattern.iterator;

/**
 * @author xuyisu
 * @description 抽象迭代器
 * @date 2021-01-04
 */
public interface Iterator {
    /**
     * 遍历到下一个元素
     */
    Object next();
    /**
     * 是否已经遍历到尾部
     */
    boolean hasNext();
    /**
     * 删除当前指向的元素
     */
    boolean remove();
}
