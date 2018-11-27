package com.spring.aop;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class Student {
    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        //跑出不合法的参数
      //  throw new IllegalArgumentException();
    }
}
