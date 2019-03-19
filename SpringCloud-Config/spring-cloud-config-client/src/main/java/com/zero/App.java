package com.zero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Value("${userName}")
	String userName;

	@RequestMapping(value = "/getUserName")
	public String getUserName () {
		return userName;
	}
}
