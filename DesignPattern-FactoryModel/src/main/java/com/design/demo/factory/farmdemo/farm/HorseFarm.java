package com.design.demo.factory.farmdemo.farm;

import com.design.demo.factory.farmdemo.animal.Animal;
import com.design.demo.factory.farmdemo.animal.Horse;

/**
 * 具体工厂：养马场
 */
public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
