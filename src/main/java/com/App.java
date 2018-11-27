package com;

import com.spring.HelloWorld;
import com.spring.event.Booking;
import com.spring.event.BookingCreatedEvent;
import com.spring.event.mail.MailSendEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
    /*    ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("other/ioc.xml");
        Booking booking = new Booking();
        booking.setName("Ss");
        booking.setId(100);
         BookingCreatedEvent event = new BookingCreatedEvent(applicationContext, booking);
        applicationContext.publishEvent(event);


        MailSendEvent mailSendEvent = new MailSendEvent((ApplicationContext)applicationContext,"jack","tom","hello word!!");
      *//*  MailBean mailBean = new MailBean("tom","jack");
        mailBean.setApplicationContext(applicationContext);
        mailBean.sendMail();*/


        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
         log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");

    }

}
