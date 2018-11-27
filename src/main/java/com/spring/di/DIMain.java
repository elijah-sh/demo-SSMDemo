package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
public class DIMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("other/bean.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
    }
}
