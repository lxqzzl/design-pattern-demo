package com.design.demo.factory.farmdemo;

import com.design.demo.factory.farmdemo.animal.Animal;
import com.design.demo.factory.farmdemo.farm.AnimalFarm;
import com.design.demo.factory.farmdemo.farm.CattleFarm;
import com.design.demo.factory.farmdemo.farm.HorseFarm;

/**
 * 畜牧场demo启动类
 */

public class FarmDemo {
    public static void main(String[] args){
            Animal animal;
            // 养马场生产马类
            AnimalFarm horsrFirm = new HorseFarm();
            animal = horsrFirm.newAnimal();
            animal.show();

            // 养牛场生产牛类
            AnimalFarm cattleFirm = new CattleFarm();
            animal = cattleFirm.newAnimal();
            animal.show();
    }
}

