package com.design.demo.abstractfactory.farmdemo.farm;

import com.design.demo.abstractfactory.farmdemo.animal.Animal;
import com.design.demo.abstractfactory.farmdemo.animal.Cattle;
import com.design.demo.abstractfactory.farmdemo.animal.Horse;
import com.design.demo.abstractfactory.farmdemo.plant.Fruitage;
import com.design.demo.abstractfactory.farmdemo.plant.Plant;
import com.design.demo.abstractfactory.farmdemo.plant.Vegetables;

/**
 * 具体工厂：B农场；生产水果和养马
 */

public class BFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成");
        return new Fruitage();
    }
}
