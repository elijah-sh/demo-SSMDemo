package com.spring.ioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class CStopEventHandler implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {

        System.out.println("ContextStopedEvent Received");

      }
}
