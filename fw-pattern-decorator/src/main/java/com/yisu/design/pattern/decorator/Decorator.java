package com.yisu.design.pattern.decorator;

/**
 * @author xuyisu
 * @description 修饰的抽象类
 * @date 2020/5/21
 */
public class Decorator extends SchoolReport{
    //首先我要知道是哪个成绩单
    private SchoolReport sr;
    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }
    //成绩单还是要被看到的
    public void report(){
        this.sr.report();
    }
    //看完还是要签名的
    public void sign(String name){
        this.sr.sign(name);
    }
}
