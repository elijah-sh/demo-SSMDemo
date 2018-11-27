package com.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class IoCMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("other/ioc.xml");
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");
        helloWorld.setMessage("Hello World !");
        helloWorld.getMessage();

        HelloWorld helloWorld2 = (HelloWorld) beanFactory.getBean("helloWorld");
        helloWorld2.getMessage();

    }
}
