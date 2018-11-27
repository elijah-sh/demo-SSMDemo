package com.spring.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class AspectMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("other/aop.xml");
        Student student = (Student) context.getBean("student");
         student.getName();
         student.getAge();
          student.printThrowException();
    }
}
