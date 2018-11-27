package com.counter.service.impl;

import com.counter.dto.Counter;
import com.counter.mapper.CounterMapper;
import com.counter.service.ICounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Service
@Repository
public class CounterServiceImpl implements ICounterService {

    @Autowired
    private CounterMapper counterMapper;

    @Override
    @Transactional
    public Counter apiCounter(String apiName){

        // 判断接口是否为第一次访问
        Counter getCounter = counterMapper.getCounter(apiName);
        System.out.println("--------------");
        System.out.println(getCounter);

        if(getCounter!=null){   // 不是第一次 +1
            counterMapper.updateCounterCount(apiName);
        }else {  //  是第一次 插入
            Counter counter = new Counter();
                    counter.setApiName(apiName);
            counter.setCount((long) 1);
            counterMapper.addCounter(counter);
        }

        return counterMapper.getCounter(apiName);
    }
    @Override
    public List<Counter> findAllCounters() {
        List<Counter> counterList = counterMapper.findAllCounters();
        if ((counterList!=null)){
            return counterList;
        }
        return null;
    }

    @Override
    public boolean addCounter(Counter counter) {
        boolean result = false;

        counterMapper.addCounter(counter);

        return false;
    }

    @Override
    public Counter getCounter(String apiName) {
        Counter counter = counterMapper.getCounter(apiName);
        if (counter!= null){
            return counter;
        }
        return null;
    }

    @Override
    public boolean updateCounterCount(String apiName) {
        counterMapper.updateCounterCount(apiName);
        return false;
    }
}
