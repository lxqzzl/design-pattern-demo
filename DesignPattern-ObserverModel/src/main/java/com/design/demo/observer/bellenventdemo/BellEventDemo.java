package com.design.demo.observer.bellenventdemo;

import com.design.demo.observer.bellenventdemo.observer.impl.StuEventListener;
import com.design.demo.observer.bellenventdemo.observer.impl.TeachEventListener;
import com.design.demo.observer.bellenventdemo.subject.BellEventSource;

public class BellEventDemo {
    public static void main(String[] args) {
        // 打铃 (事件源)
        BellEventSource bell = new BellEventSource();
        // 注册监听器 (老师)
        bell.addPersonListener(new TeachEventListener());
        // 注册监听器(学生)
        bell.addPersonListener(new StuEventListener());
        // 打上课铃声
        bell.ring(true);
        System.out.println("------------");
        // 打下课铃声
        bell.ring(false);
    }
}
