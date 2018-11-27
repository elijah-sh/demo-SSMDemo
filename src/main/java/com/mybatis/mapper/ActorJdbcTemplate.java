package com.mybatis.mapper;

import com.spring.jdbc.actor.Actor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class ActorJdbcTemplate {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    /*
    具名参数: SQL 按名称(以冒号开头)而不是按位置进行指定. 具名参数更易于维护,
     也提升了可读性. 具名参数由框架类在运行时用占位符取代
        具名参数只在 NamedParameterJdbcTemplate 中得到支持。
        NamedParameterJdbcTemplate可以使用全部jdbcTemplate方法,
        除此之外,我们来看看使用它的具名参数案例:
     */

    public  void  setDataSource (DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Actor> findAllActors() {
        return this.jdbcTemplate.query( "select first_name, last_name from t_actor", new ActorMapper());
    }
    private static final class ActorMapper implements RowMapper<Actor> {
        @Override
        public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Actor actor = new Actor();
            actor.setFirstName(rs.getString("first_name"));
            actor.setLastName(rs.getString("last_name"));
            return actor;
        }
    }

    public  List<Actor> findAll(){
        List<Actor> actors = this.jdbcTemplate.query(
                "select first_name, last_name from t_actor",
                new RowMapper<Actor>() {
                    @Override
                    public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Actor actor = new Actor();
                        actor.setFirstName(rs.getString("first_name"));
                        actor.setLastName(rs.getString("last_name"));
                        return actor;
                    }
                });
        return actors;
    }

    public boolean insert(Actor actor){
        Integer result =     this.jdbcTemplate.update(
                "insert into t_actor (first_name, last_name) values (?, ?)",
                actor.getFirstName(), actor.getLastName());
        System.out.println("insert: "+result);
        if (result!=1){
            return false;
        }
        return true;
    }
    public boolean update(Actor actor){

        Integer result =    this.jdbcTemplate.update(
                "update t_actor set last_name = ? where id = ?",
                actor.getLastName(),actor.getId());
        System.out.println("update: "+result);
        if (result!=1){
            return false;
        }
        return true;
    }
    public boolean delete(Actor actor){

      Integer result =  this.jdbcTemplate.update(
                "delete from t_actor where id = ?",
                Long.valueOf(actor.getId()));
        System.out.println("delete: "+result);
        if (result!=1){
            return false;
        }
        return true;
    }

    public int countOfActorsByFirstName(String firstName) {
        String sql = "select count(*) from T_ACTOR where first_name = :first_name";
        Map<String, String> namedParameters = Collections.singletonMap("first_name", firstName);
        return this.namedParameterJdbcTemplate.queryForObject(sql,  namedParameters,Integer.class);
    }

    public int countOfActors(Actor exampleActor) {
// notice how the named parameters match the properties of the above 'Actor' class
        String sql = "select count(*) from T_ACTOR where first_name = :firstName and last_name = :lastName";
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(exampleActor);
        return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
    }
}
