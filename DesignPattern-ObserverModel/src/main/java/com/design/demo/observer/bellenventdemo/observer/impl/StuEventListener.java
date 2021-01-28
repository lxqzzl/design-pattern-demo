package com.design.demo.observer.bellenventdemo.observer.impl;

import com.design.demo.observer.bellenventdemo.event.RingEvent;
import com.design.demo.observer.bellenventdemo.observer.BellEventListener;

/**
 * 具体观察者类：学生事件监听器
 */

public class StuEventListener implements BellEventListener {
    public void heardBell(RingEvent ringEvent) {
        if (ringEvent.getSound()) {
            System.out.println("同学们上课了...");
        } else {
            System.out.println("同学们下课了...");
        }
    }
}
