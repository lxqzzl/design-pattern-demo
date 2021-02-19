package com.design.demo.abstractfactory.farmdemo.animal;

/**
 * 具体产品：马
 */
public class Horse implements Animal{
    private final String name;
    public Horse(){
        this.name = "马";
    }

    @Override
    public void show() {
        System.out.println("这是："+this.name);
    }
}
