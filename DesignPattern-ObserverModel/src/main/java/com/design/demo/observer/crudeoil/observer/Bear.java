package com.design.demo.observer.crudeoil.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者类：空方
 */

public class Bear implements Observer {
    public void update(Observable observer, Object object) {
        Float price = ((Float) object).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
