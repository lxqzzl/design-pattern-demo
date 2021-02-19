package com.design.demo.observer.crudeoil;

import com.design.demo.observer.crudeoil.observer.Bear;
import com.design.demo.observer.crudeoil.observer.Bull;
import com.design.demo.observer.crudeoil.subject.OilFutures;

import java.util.Observer;

/**
 * 油价变化demo启动类
 */

public class CrudeOilDemo {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        //多方
        Observer bull = new Bull();
        //空方
        Observer bear = new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
