package com.yisu.design.pattern.iterator;

/**
 * @author xuyisu
 * @description 抽象容器
 * @date 2021-01-14
 */
public interface Aggregate {

    //是容器必然有元素的增加
    void add(Object object);
    //减少元素
    void remove(Object object);
    //由迭代器来遍历所有的元素
    Iterator iterator();

}
