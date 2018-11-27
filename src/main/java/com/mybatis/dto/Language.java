package com.mybatis.dto;

import java.util.Date;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
public class Language {
    private Long languageId;
    private String name;
    private Date lastUpdate;

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
