package com.design.demo.abstractfactory.farmdemo.farm;

import com.design.demo.abstractfactory.farmdemo.animal.Animal;
import com.design.demo.abstractfactory.farmdemo.plant.Plant;

/**
 * 抽象工厂：农场类
 */
public interface Farm {
    Animal newAnimal();
    Plant newPlant();
}
