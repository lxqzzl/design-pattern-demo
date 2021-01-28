package com.design.demo.observer.rmbratedemo.concretesubject;

import com.design.demo.observer.rmbratedemo.subject.Rate;
import com.design.demo.observer.rmbratedemo.observer.Company;

/**
 *  具体目标：人民币汇率
 *  实现了父类的 change(int number) 方法，即当人民币汇率发生改变时通过相关公司
 */

public class RMBRate extends Rate {
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}
