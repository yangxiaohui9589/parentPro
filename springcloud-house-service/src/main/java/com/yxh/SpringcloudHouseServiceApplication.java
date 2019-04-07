package com.yxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudHouseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHouseServiceApplication.class, args);
	}

}
