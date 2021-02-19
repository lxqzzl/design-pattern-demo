package com.design.demo.factory.farmdemo.farm;

import com.design.demo.factory.farmdemo.animal.Animal;
import com.design.demo.factory.farmdemo.animal.Cattle;

/**
 * 具体工厂：养牛场
 */
public class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
