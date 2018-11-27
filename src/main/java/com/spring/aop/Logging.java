package com.spring.aop;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class Logging {
    /**
     * This is the method which I would like to execute
     * before a selected method execution. 执行
     */
    public void beforeAdvice(){
        System.out.println("Going to setup student profile --> before .");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("Student profile has been setup . --> after");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning : --->返回 " + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
