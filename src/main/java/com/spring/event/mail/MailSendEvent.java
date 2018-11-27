package com.spring.event.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ShenShuaihu on 2018/8/15.
 * 定义事件
 */
@Component
public class MailSendEvent extends ApplicationEvent {


    public MailSendEvent(Object source, String fromAddress, String toAddress, String mailContext) {
        super(source);
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.mailContext = mailContext;
    }

    private String fromAddress;
    private String toAddress;
    private String mailContext;



    public String getMailContext() {
        return mailContext;
    }

    public void setMailContext(String mailContext) {
        this.mailContext = mailContext;
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

    @Override
    public String toString() {
        return fromAddress + " Send Mail to " + toAddress  +" 邮件内容："+mailContext;
    }
}
