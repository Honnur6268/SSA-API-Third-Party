package com.honnur.ssa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI myOpenAPI() {

		Contact contact = new Contact();
		contact.setEmail("honnurcse.rymec@gmail.com");
		contact.setName("Honnur Ali");
		contact.setUrl("NA");

		License mitLicense = new License().name("License").url("NA");

		Info info = new Info().title("SSA-API").version("1.0").contact(contact)
				.description("This API exposes endpoints to access Dummy SSA Details").termsOfService("NA")
				.license(mitLicense);

		return new OpenAPI().info(info);
	}
}
