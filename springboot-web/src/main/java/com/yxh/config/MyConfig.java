package com.yxh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: 通过配置方式获取值
 * @author : yangxh
 * @date : 2019/4/7 1:54
 * @version v1.0
 */
@ConfigurationProperties(prefix = "com.yxh")
@Component
public class MyConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
