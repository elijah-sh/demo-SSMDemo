package com.counter.mapper;

import com.counter.dto.Counter;
import com.counter.dto.Customer;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Repository
public interface CounterMapper {
   List<Counter> findAllCounters();
   Integer addCounter(Counter counter);
    Integer updateCounter (Counter counter);


    @Select("SELECT * FROM counter")
    @Options
    List<Counter> findCounter();

    /**
     *
     * @param apiName  接口名字
     * @return
     */
    Counter getCounter(String apiName);

    /**
     *
     * @param apiName 需要+1 的接口名字
     * @return
     */
    Integer updateCounterCount(String apiName);
}
