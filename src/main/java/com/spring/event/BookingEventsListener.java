package com.spring.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by ShenShuaihu on 2018/8/15.
 * 定义观察者
 */
//@Component
public class BookingEventsListener implements ApplicationListener<BookingCreatedEvent> {

    //listener实现
    public void onApplicationEvent(BookingCreatedEvent bookingCreatedEvent) {
        System.out.println("===book id  :  "+bookingCreatedEvent.getBooking().getId());
    }
}
