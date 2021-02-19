package com.design.demo.abstractfactory.farmdemo.farm;

import com.design.demo.abstractfactory.farmdemo.animal.Animal;
import com.design.demo.abstractfactory.farmdemo.animal.Cattle;
import com.design.demo.abstractfactory.farmdemo.plant.Plant;
import com.design.demo.abstractfactory.farmdemo.plant.Vegetables;

/**
 * 具体工厂：A农场；生产蔬菜和养牛
 */

public class AFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成");
        return new Vegetables();
    }
}
