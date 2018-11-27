package com.spring.dto;

import java.util.Date;

/**
 * Created by ShenShuaihu on 2018/8/13.
 */
public class Language {
    //language_id, name, last_update

    private Integer languageId;
    private String name;
    private Date lastUpdate;

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
