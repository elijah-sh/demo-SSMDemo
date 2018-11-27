package com.spring.bean;

import com.spring.di.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/8/18 11:27
 * @Description:  注解学习  之   @Autowired
 */
 public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;
   // @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
     public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
