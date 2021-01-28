package com.design.demo.observer.bellenventdemo.observer.impl;

import com.design.demo.observer.bellenventdemo.event.RingEvent;
import com.design.demo.observer.bellenventdemo.observer.BellEventListener;

/**
 * 具体观察者类：老师事件监听器
 */

public class TeachEventListener implements BellEventListener {
    public void heardBell(RingEvent ringEvent) {
        if (ringEvent.getSound()) {
            System.out.println("老师上课...");
        } else {
            System.out.println("老师下课...");
        }
    }
}
