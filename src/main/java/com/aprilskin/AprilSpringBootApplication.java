package com.aprilskin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AprilSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprilSpringBootApplication.class, args);
	}
}
