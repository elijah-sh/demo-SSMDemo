package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */

public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("other/ioc.xml");
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
        obj.getMessage();
    }
}