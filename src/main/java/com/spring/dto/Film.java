package com.spring.dto;

import java.util.Date;

/**
 * Created by ShenShuaihu on 2018/8/13.
 */
public class Film {
    //film_id, title, description, release_year, language_id, original_language_id,
    // rental_duration, rental_rate, length, replacement_cost, rating, special_features, last_update


    private Integer filmId;
    private String title;
    private String description;
    private Integer language_id;
    private String name;
    private Integer length;
    private Date lastUpdate;
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", language_id=" + language_id +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", lastUpdate=" + lastUpdate +
                ", language=" + language +
                '}';
    }
}
