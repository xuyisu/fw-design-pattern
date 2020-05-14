package com.yisu.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author xuyisu
 * @description 建造者
 * @date 2020/5/14
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
