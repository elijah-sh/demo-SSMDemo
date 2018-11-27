package com.counter.controller;

import com.counter.dto.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Controller
public class HelloController{

   // @ExceptionHandler(IllegalAccessException.class)

    @RequestMapping(value = "/test" )
    @ResponseBody
    public Counter print () {
       Counter counter = new Counter();
       counter.setApiName("shenshuaihu");
       counter.setCount((long) 30);
         return counter;
    }
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect () {
        Counter counter = new Counter();
        counter.setApiName("shenshuaihu");
        counter.setCount((long) 30);

        return "redirect:test";
    }





    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

}
