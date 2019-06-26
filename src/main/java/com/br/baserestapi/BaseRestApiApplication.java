package com.br.baserestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.br.baserestapi.config.property.BaseApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(BaseApiProperty.class)
public class BaseRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseRestApiApplication.class, args);
	}

}
