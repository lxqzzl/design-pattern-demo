package com.design.demo.abstractfactory.farmdemo.plant;

/**
 * 具体产品：蔬菜类
 */

public class Vegetables implements Plant{
    private final String name;
    public Vegetables() {
        this.name = "蔬菜";
    }
    @Override
    public void show() {
        System.out.println("这是："+this.name);
    }
}
