package com.spring.jdbc;

import com.spring.dto.Film;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ShenShuaihu on 2018/8/16.
 */
public class FilmsJDBCTemplate  {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

/*    public Film getFilm(Integer id) {
        String SQL = "select * from film where id = ?";
        Film film = jdbcTemplate.queryForObject(SQL,    new Object[]{id}, new FilmMapper());

        return film;
    }  */
    public int getRowCount() {
        int rowCount = this.jdbcTemplate.queryForObject("select count(*) from film", Integer.class);
        return rowCount;
    }
    public List<Film> getlistFilms() {
        String SQL = "select film_id ,title , description ,last_update from film";

        List<Film> films = this.jdbcTemplate.query(    SQL,  new RowMapper<Film>() {
                    @Override
                    public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Film film = new Film();
                        film.setTitle(rs.getString("title"));
                        film.setDescription(rs.getString("description"));
                        film.setLastUpdate(rs.getDate("last_update"));
                        return film;
                    }
                });
        return films;
    }
    public Film getFilmById(Integer film_id ) {
        Film film = this.jdbcTemplate.queryForObject(
                "select film_id ,title , description ,last_update from film where film_id = ?",
                new Object[]{film_id},
                new RowMapper<Film>() {
                    @Override
                    public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Film film = new Film();
                        film.setTitle(rs.getString("title"));
                        film.setDescription(rs.getString("description"));
                        film.setLastUpdate(rs.getDate("last_update"));
                        return film;
                    }
                });

        return film;
    }
}
