package com.spring.spring2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(value = "com.spring.spring2021.entity")
@EnableJpaRepositories(value="com.spring.spring2021.repository")
@ComponentScan(basePackages={"com.spring.spring2021.controller","com.spring.spring2021.service"})
public class Spring2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring2021Application.class, args);
	}

}