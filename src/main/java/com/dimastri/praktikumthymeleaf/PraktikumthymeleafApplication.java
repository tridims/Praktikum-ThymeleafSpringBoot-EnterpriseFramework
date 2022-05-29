package com.dimastri.praktikumthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
public class PraktikumthymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktikumthymeleafApplication.class, args);
	}

}
