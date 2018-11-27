package com.counter.controller;

import com.counter.dto.Counter;
import com.counter.dto.Customer;
import com.counter.service.ICounterService;
import com.counter.service.ICustomerService;
import com.github.pagehelper.Page;
import org.apache.ibatis.ognl.IntHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/8/21 11:50
 * @Description:
 */
@Controller
public class CustomerController {
    static Logger log = Logger.getLogger(CounterController.class.getName());

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/customer" )
    public String getCustomer () {
         return "customer";
    }

    @RequestMapping(value = "/getCustomer" )
    @ResponseBody
    public Map<String,Object> getCustomersList (Customer customer, int pageNum, int pageSize) {

        Map<String,Object> map = new HashMap();

        Page<Customer> customerPage = customerService.getCustomerPage(customer,pageNum,pageSize);
        List<Customer> customerList = customerPage.getResult();
        int pagePages =  customerPage.getPages();
        map.put("customerList",customerList);
        map.put("pagePages",pagePages);

       //  log.info("查询数据："+customerPage.toString());
        return map;
    }

}
