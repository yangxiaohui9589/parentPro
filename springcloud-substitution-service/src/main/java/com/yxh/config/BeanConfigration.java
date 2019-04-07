package com.yxh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : yangxh
 * @version V1.0
 * @Project: parentPro
 * @Package com.yxh.config
 * @Description: TODO
 * @date Date : 2019年04月07日 19:09
 */
@Configuration
public class BeanConfigration {

    @Bean
    //使用服务名称调用添加该注解，会生成LoadBalancedClient接口的实现类，并且会注册到spring容器中
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
