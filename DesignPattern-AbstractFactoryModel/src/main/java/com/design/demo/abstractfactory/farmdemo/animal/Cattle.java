package com.design.demo.abstractfactory.farmdemo.animal;

/**
 * 具体产品：牛
 */
public class Cattle implements Animal {
    private final String name;
    public Cattle(){
        this.name = "牛";
    }

    @Override
    public void show(){
        System.out.println("这是："+this.name);
    }
}
