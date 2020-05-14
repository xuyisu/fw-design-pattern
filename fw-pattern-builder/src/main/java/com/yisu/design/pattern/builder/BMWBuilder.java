package com.yisu.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author xuyisu
 * @description //TODO
 * @date 2020/5/14
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
