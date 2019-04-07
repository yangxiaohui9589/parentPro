package com.yxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudSubstitutionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSubstitutionServiceApplication.class, args);
	}

}
