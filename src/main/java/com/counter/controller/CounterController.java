package com.counter.controller;

import com.App;
import com.counter.dto.Counter;
import com.counter.service.ICounterService;
import com.counter.service.impl.CounterServiceImpl;
import com.counter.utils.SpringException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Controller
public class CounterController {
    static Logger log = Logger.getLogger(CounterController.class.getName());

    @Autowired
    private ICounterService  counterService;

    //@ExceptionHandler(IllegalArgumentException.class)


    @RequestMapping(value = "/add")
    public String apiAdd(ModelMap model) {
         model.addAttribute("message", "Hello Spring MVC Framework!");
      Counter counter = counterService.apiCounter("add");
        model.addAttribute("data", "本次浏览次数为  : "+counter.getCount());
        log.info("本次浏览次数为: "+counter.getCount());
        return "hello";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    @ExceptionHandler({IllegalArgumentException.class})

    public String exception () {
        Counter counter = new Counter();
        counter.setApiName("shenshuaihu");
        counter.setCount((long) 30);

        if( counter.getCount() > 10 ){
            log.info("exception: " );
            throw new SpringException("testException");
        }

        return "hello";
    }

    @RequestMapping(value = "/counter", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("counter", "command", new Counter());
    }

    @RequestMapping(value = "/addCounter", method = RequestMethod.POST)
  /*  @ExceptionHandler({SpringException.class})*/
    public String addCounter( @ModelAttribute("HelloWeb")Counter counter,
                              ModelMap model) {
        if(counter.getApiName().length() < 5 ){
            throw new SpringException("Given name is too short");
        }else{
            model.addAttribute("name", counter.getApiName());
        }
        if( counter.getCount() < 10 ){
          throw new SpringException("Given age is too low");
        }else{
            model.addAttribute("age", counter.getCount());
        }
        model.addAttribute("id", counter.getCount());
        return "result";
    }



}
