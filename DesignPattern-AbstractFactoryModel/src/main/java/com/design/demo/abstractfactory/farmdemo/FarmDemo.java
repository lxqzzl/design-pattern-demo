package com.design.demo.abstractfactory.farmdemo;

import com.design.demo.abstractfactory.farmdemo.animal.Animal;
import com.design.demo.abstractfactory.farmdemo.farm.AFarm;
import com.design.demo.abstractfactory.farmdemo.farm.BFarm;
import com.design.demo.abstractfactory.farmdemo.farm.Farm;
import com.design.demo.abstractfactory.farmdemo.plant.Plant;

/**
 * 农场demo启动类
 */
public class FarmDemo {
    public static void main(String[] args){
        Animal animal;
        Plant plant;
        // A农场
        System.out.println("在A农场---------------------->");
        Farm aFirm = new AFarm();
        animal = aFirm.newAnimal();
        plant = aFirm.newPlant();
        animal.show();
        plant.show();

        // B农场
        System.out.println("在B农场---------------------->");
        Farm bFirm = new BFarm();
        animal = bFirm.newAnimal();
        plant = bFirm.newPlant();
        animal.show();
        plant.show();
    }
}
