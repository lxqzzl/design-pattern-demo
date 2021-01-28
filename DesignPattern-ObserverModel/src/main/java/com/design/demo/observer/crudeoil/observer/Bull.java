package com.design.demo.observer.crudeoil.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者类：多方
 */

public class Bull implements Observer {
    public void update(Observable observable, Object object) {
        Float price = ((Float) object).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
