package com.spring;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class HelloWorld {
    private  String message;

    public void getMessage() {

        System.out.println( "HelloWorld: "+message);
       // return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
