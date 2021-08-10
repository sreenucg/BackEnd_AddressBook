package com.contacts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	  @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
	  .select() .apis(RequestHandlerSelectors.any()) .paths(PathSelectors.any())
	  .build(); }
	 
	
	
	/*
	 * @Bean public Docket api() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.contacts.model.AddressBook")).
	 * build().apiInfo(apiDetails()); }
	 * 
	 * private ApiInfo apiDetails() { return new ApiInfo("ADDRESS BOOK API",
	 * "Sample API for DEV Homework", "1.0.0", "Free to use", new
	 * springfox.documentation.service.Contact("Sreenu", null, "z@gamil.com"),
	 * "API LIsence", " ", Collections.emptyList()); }
	 */


}
