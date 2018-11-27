package com.counter.service.impl;

import com.counter.dto.Customer;
import com.counter.mapper.CustomerMapper;
import com.counter.service.ICustomerService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/8/21 11:30
 * @Description:
 */
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Page<Customer> getCustomerPage(Customer customer, int pageNum, int pageSize){

        PageHelper.startPage(pageNum, pageSize);
        Page<Customer> customerPage = (Page<Customer>) customerMapper.selectAllCustomers();
        return customerPage;

    }


}
