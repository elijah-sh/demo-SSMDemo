package com.spring.event.mail;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by ShenShuaihu on 2018/8/15.
 * 定义观察者
 */

@Component
public class MailSendEventListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        System.out.println("发生一个邮件发送的事件：" + mailSendEvent);
    }
}
