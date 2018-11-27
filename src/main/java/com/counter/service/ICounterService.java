package com.counter.service;

import com.counter.dto.Counter;

import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
public interface ICounterService {

    public Counter apiCounter(String apiName);

    /**
     * 查找所有
     * @return
     */
   public List<Counter> findAllCounters();

    /**
     *
     * @param counter 实体
     * @return
     */
    public boolean addCounter(Counter counter);

    /**
     *
     * @param apiName  接口名字
     * @return
     */
    public Counter getCounter(String apiName);

    /**
     *
     * @param apiName 需要+1 的接口名字
     * @return
     */
    public boolean updateCounterCount(String apiName);




}
