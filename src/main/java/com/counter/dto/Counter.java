package com.counter.dto;

/**
 * Created by ShenShuaihu on 2018/8/17.
 */
public class Counter {
    private Integer id;
    private String apiName;
    private Long count ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
