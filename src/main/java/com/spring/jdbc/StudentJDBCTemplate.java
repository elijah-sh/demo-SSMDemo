package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by ShenShuaihu on 2018/8/15.
 * implements StudentDAO
 */
public class StudentJDBCTemplate  {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";

        jdbcTemplate.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

/*    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplate.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }*/

/*    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplate.query(SQL,
                new StudentMapper());
        return students;
    }*/

    public void delete(Integer id){
        String SQL = "delete from Student where id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplate.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }

}