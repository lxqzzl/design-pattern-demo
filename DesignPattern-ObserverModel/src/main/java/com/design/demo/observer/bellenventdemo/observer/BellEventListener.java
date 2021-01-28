package com.design.demo.observer.bellenventdemo.observer;

import com.design.demo.observer.bellenventdemo.event.RingEvent;

import java.util.EventListener;

/**
 * 抽象观察者类：铃声事件监听器
 */

public interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    void heardBell(RingEvent e);
}
