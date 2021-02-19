package com.design.demo.abstractfactory.farmdemo.plant;

/**
 * 具体产品：植物类
 */

public class Fruitage implements Plant{
    private final String name;

    public Fruitage(){
        this.name = "水果";
    }

    @Override
    public void show() {
        System.out.println("这是："+ this.name);
    }
}
