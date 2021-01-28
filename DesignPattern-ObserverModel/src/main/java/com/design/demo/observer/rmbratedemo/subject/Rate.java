package com.design.demo.observer.rmbratedemo.subject;

import com.design.demo.observer.rmbratedemo.observer.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标：汇率
 * 包含了保存观察者（Company）的 List 和增加/删除观察者的方法，以及有关汇率改变的抽象方法 change(int number)
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<>();
    /**
     * 增加观察者方法
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 删除观察者方法
     */
    public void remove(Company company) {
        companys.remove(company);
    }


    public abstract void change(int number);
}
