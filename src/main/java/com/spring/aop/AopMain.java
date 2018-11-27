package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("other/aop.xml");
        Student student = (Student) context.getBean("student");
         student.getName();
         student.getAge();
          student.printThrowException();
    }
}
