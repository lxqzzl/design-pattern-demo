package com.design.demo.observer.bellenventdemo.subject;

import com.design.demo.observer.bellenventdemo.event.RingEvent;
import com.design.demo.observer.bellenventdemo.observer.BellEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标类：事件源，铃
 */
public class BellEventSource {
    private final List<BellEventListener> bellEventListeners; //监听器容器
    public BellEventSource() {
        bellEventListeners = new ArrayList<>();
    }

    //给事件源绑定监听器
    public void addPersonListener(BellEventListener ren) {
        bellEventListeners.add(ren);
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        //通知注册在该事件源上的所有监听器
        notifies(event);
    }

    //当事件发生时,通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
    protected void notifies(RingEvent e) {
        for (BellEventListener eventListener : bellEventListeners) {
            eventListener.heardBell(e);
        }
    }
}
