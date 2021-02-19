package com.design.demo.factory.farmdemo.farm;

import com.design.demo.factory.farmdemo.animal.Animal;

/**
 * 抽象工厂：畜牧场
 */
public interface AnimalFarm {
    Animal newAnimal();
}
