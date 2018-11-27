package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * Created by ShenShuaihu on 2018/8/15.
 */
public class Simple {

  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("other/jdbc.xml");
    JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("JdbcTemplate");
    public void  query()  throws SQLException {
        String SQL = "select * from film";
     /*  Film rs = jdbcTemplate.queryForObject(SQL, new RowMapper<Film>() {
            @Override
            public Film mapRow(ResultSet resultSet, int i) throws SQLException {
             String s= resultSet.getString(i);
                System.out.println(s);
                return null;
            }
        });*/
       /* List<Film> list =  jdbcTemplate.queryForList(SQL, Film.class);
        int s= list.size();*/
        System.out.println(jdbcTemplate.getDataSource().getConnection().toString());
        System.out.println(jdbcTemplate.getQueryTimeout());
       // jdbcTemplate.query(SQL,(ResultSet ))
    }
    public static void main(String[] args)  throws SQLException {
        Simple simple = new Simple();
        simple.query();
    }

}
