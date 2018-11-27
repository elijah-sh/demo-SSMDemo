package com.spring.aop.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Aspect
public class Logging {
/** Following is the definition for a pointcut to select
 * all the methods available. So advice will be called
 * for all the methods.
 */
    @Pointcut("execution(* com.spring.aop.aspect.Student.getName(..))")
    private void selectAll(){}
    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("BeforeAdvice --->  Going to setup student profile.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("AfterAdvice ---> Student profile has been setup.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.   returning 返回值  如果空会报错
     */
    @AfterReturning(pointcut = "selectAll()", returning="retVal")
    public void afterReturningAdvice(Object retVal){
        //  retVal  返回值
        System.out.println("AfterReturningAdvice --->  Returning:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
