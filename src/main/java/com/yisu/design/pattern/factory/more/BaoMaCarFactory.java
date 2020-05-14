package com.yisu.design.pattern.factory.more;

import com.yisu.design.pattern.factory.normal.BaoMaCar;

/**
 * @author xuyisu
 * @description 升级为多个工厂类 -宝马车工厂
 * @date 2020/5/14
 */
public class BaoMaCarFactory extends AbstractCarFactory {

    public BaoMaCar createCar() {
        return new BaoMaCar();
    }
}
