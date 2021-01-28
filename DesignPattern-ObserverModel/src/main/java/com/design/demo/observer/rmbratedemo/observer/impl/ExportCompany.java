package com.design.demo.observer.rmbratedemo.observer.impl;

import com.design.demo.observer.rmbratedemo.observer.Company;

/**
 * 具体观察者2：出口公司
 * 现了父类的 response(int number) 方法，即当它们接收到汇率发生改变的通知时作为相应的反应
 */

public class ExportCompany implements Company {
    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率提升" + number + "个基点，降低了进口产品成本，提升了进口公司利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }
}
