package com.yxh.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : yangxh
 * @version V1.0
 * @Project: parentPro
 * @Package com.yxh.controller
 * @Description: TODO
 * @date Date : 2019年04月07日 19:10
 */
@RestController
public class SubstitutionController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/getHouseAddr")
    public String getHouseAddr(){
        //return restTemplate.getForObject("http://localhost:8081/getAddr",String.class);
        //使用@LoadBalanced,调用服务使用服务名调用。
        return restTemplate.getForObject("http://house-service/getAddr",String.class);
    }

    /**
     * @Description: 通过EurekaClient 获取某个服务的信息
     *               还可以通过discoveryClient.getInstances("house-service");调用，效果一样
     * @author : yangxh
     * @date : 2019/4/7 21:17
     * @version v1.0
     */
    @GetMapping("/infos")
    public Object getServiceUrl(){
        return eurekaClient.getInstancesByVipAddress("house-service",false);
    }
}
