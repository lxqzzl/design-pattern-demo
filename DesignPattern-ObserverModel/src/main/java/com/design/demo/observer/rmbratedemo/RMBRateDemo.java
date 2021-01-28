package com.design.demo.observer.rmbratedemo;

import com.design.demo.observer.rmbratedemo.observer.impl.ExportCompany;
import com.design.demo.observer.rmbratedemo.observer.impl.ImportCompany;
import com.design.demo.observer.rmbratedemo.concretesubject.RMBRate;
import com.design.demo.observer.rmbratedemo.observer.Company;
import com.design.demo.observer.rmbratedemo.subject.Rate;

/**
 * ??????????????????????????????????????????????????????????????
 */

public class RMBRateDemo {
    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}
