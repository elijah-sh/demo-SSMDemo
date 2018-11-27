package com.counter.mapper;

import com.counter.dto.Customer;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
@Mapper
@Repository
public interface CustomerMapper {

  //@ResultMap(id="")

  @ResultMap(value = "customerResultMap")
  @Select("SELECT * FROM customer")
    List<Customer> selectAllCustomers();

    /**
     * 插入Customer对象
     */
    @Insert("insert into customer (customer_id,first_name,last_name) "
            + " values(#{customerId},#{firstName},#{lastName}) ")
    @Options(useGeneratedKeys=false)
    public int insertCustomer(Customer customer);
    /**
     * 更新Customer对象
     */
    @Update("update customer set first_name=#{firstName},last_name=#{lastName} "
            + " where customer_id=#{customerId} ")
    public int updateCustomer(Customer customer);
    /**
     * 删除用户对象
     */
    @Delete("delete from customer where customer_id=#{customerId}")
    public int deleteCustomer(@Param("customerId") int customerId);

    @Select("SELECT customer_id ,first_name ,last_name FROM customer  WHERE first_name in" +
            "       <foreach item='A' index='index' collection='list' " +
            "            open='(' separator=','close=')' >  "    +
            " \' #{A}\' "+
            "   </foreach>  ")
    List<Customer> selectCustomersByforeach(List list);



}
