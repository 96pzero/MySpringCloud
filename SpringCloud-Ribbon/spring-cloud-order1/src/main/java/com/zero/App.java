package com.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	@LoadBalanced // https://blog.csdn.net/xiao_jun_0820/article/details/78917215
	// @LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
