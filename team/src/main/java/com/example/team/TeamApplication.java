package com.example.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@SpringBootApplication
@EnableEurekaClient
public class TeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamApplication.class, args);
	}
	
	@Bean
	public StringJsonMessageConverter jsonConveter() {
		return new StringJsonMessageConverter();
	}
}
