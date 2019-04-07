package com.yxh.controller;

import com.yxh.config.MyConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 *  使用如下三种方式进行配置文件中属性的获取：
 *     1.采用Enviroment的getProperty方法。
 *     2.采用@Value注解。
 *     3.采用自定义配置类，prefix定义配置的前缀。
 * @author : yangxh
 * @date : 2019/4/7 1:53
 * @version v1.0
 */
@RestController
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private Environment env;

    @Value("${server.port}")
    private String serverPort;

    @Value("${self.hello}")
    private String selfHello;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @GetMapping("/getServerPortByEnv")
    public String getServerPortByEnv(){
        return env.getProperty("server.port");
    }

    @GetMapping("/getPropertiesByEnv")
    public String getPropertiesByEnv(){
        return selfHello;
    }
    @GetMapping("/getServerPortByValue")
    public String getServerPortByValue(){
        return serverPort;
    }

    @GetMapping("getPropertyByConifg")
    public String getPropertyByConifg(){
        return myConfig.getName();
    }


    @GetMapping("/test")
    public void test(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.print("2222222222222222222");
            }
        });

        executorService.execute(()->{
            try{
                System.out.print("11111111111111111");
            }catch (Exception e){
                e.printStackTrace();
            }finally {

            }
        });
    }
}
