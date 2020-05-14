package com.yisu.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author xuyisu
 * @description //TODO
 * @date 2020/5/14
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
