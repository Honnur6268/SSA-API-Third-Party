package com.honnur.ssa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.models.annotations.OpenAPI30;

@SpringBootApplication
@OpenAPI30
public class SsaApiThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsaApiThirdPartyApplication.class, args);
	}

}
