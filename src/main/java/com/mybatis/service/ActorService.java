package com.mybatis.service;

import com.mybatis.dto.Actor;
import com.mybatis.mapper.ActorMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
public class ActorService {
    @Autowired
    private  ActorMapper actorMapper;
     public List<Actor> findAllActors (){
       return actorMapper.findAllActors();
   }
}
