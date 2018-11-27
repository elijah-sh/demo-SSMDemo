package com.counter.service;

import com.counter.dto.Customer;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/8/21 11:30
 * @Description:
 */
public interface ICustomerService {


 public Page<Customer> getCustomerPage(Customer customer,int pageNum, int pageSize);


}
