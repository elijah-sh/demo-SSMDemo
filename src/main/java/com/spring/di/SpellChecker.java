package com.spring.di;

import org.springframework.stereotype.Repository;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Repository
public class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor（构造器）." );
    }
    public void checkSpelling() {
        System.out.println("Inside（内部的） checkSpelling." );
    }
}
