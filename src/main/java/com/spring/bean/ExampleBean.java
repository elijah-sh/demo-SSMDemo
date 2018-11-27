package com.spring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by ShenShuaihu on 2018/8/16.
 * 测试生命周期
 */
public class ExampleBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        // do some initialization work
    }
    public void init() {
        // do some initialization work
    }

    public void destroy() {
// do some destruction work
    }
}
