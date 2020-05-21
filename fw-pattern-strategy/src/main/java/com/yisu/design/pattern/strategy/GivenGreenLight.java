package com.yisu.design.pattern.strategy;

/**
 * @author xuyisu
 * @description 吴国太开绿灯
 * @date 2020/5/21
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
