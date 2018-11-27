package com.spring.event.mail;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by ShenShuaihu on 2018/8/15.
 * 定义触发事件发生的地方，即发送邮件的地方
 */
public class MailBean implements ApplicationContextAware {


    private String fromAddress;
    private String toAddress;

    ApplicationContext applicationContext;

    public MailBean(String fromAddress, String toAddress) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public void sendMail() {
        System.out.println(fromAddress + " Send Mail to " + toAddress);
        MailSendEvent event = new MailSendEvent(applicationContext, fromAddress, toAddress,"h");
        applicationContext.publishEvent(event);
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

}
