package com.design.demo.observer.rmbratedemo.observer;

/**
 * 抽象观察者
 * 定义了一个有关汇率反应的抽象方法 response(int number)；
 */
public interface Company {
    /**
     * 关汇率反应的抽象方法
     */
    void response(int number);
}
