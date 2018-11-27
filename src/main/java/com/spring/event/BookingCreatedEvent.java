package com.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class BookingCreatedEvent extends ApplicationEvent {

    private  Booking booking;

    public BookingCreatedEvent(Object source, Booking booking) {
        super(source);
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    @Override
    public String toString() {
        return  booking.getName()  ;
    }
}
