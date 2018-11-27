package com.spring.ioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

    public void onApplicationEvent(ContextStartedEvent event) {

        System.out.println("ContextStartedEvent Received");

      }
}
