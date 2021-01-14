package com.yisu.design.pattern.memento;

/**
 * @author xuyisu
 * @description 备忘录管理员角色
 * @date 2021/1/15
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
