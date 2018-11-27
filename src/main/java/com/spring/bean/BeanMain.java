package com.spring.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class BeanMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("other/bean.xml");
      //  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
       // obj.getMessage();
        //Spring在非web应用中关闭IoC容器 (registerShutdownHook)


       /* Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );*/

        TextEditor te = (TextEditor) context.getBean("beanTextEditor");
        te.spellCheck();


        //context.registerShutdownHook();

    }
}
