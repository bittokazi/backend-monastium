package com.salesmanager.shop.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger2
public class ShopApplication extends SpringBootServletInitializer {
	private static final String SWAGGER_VERSION = "1.0";
	private static final String LICENSE = "license";
	private static final String title = "Rest API for Shopizer";
	private static final String description = "Rest API for Shopizer";
	private static Class<ShopApplication> application = ShopApplication.class;
	
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(application);
    }
    
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select()  
//           .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//           .paths(PathSelectors.any()).build().pathMapping("/")
//           .apiInfo(apiInfo()).useDefaultResponseMessages(false);
//    }
//
//    @Bean
//    public ApiInfo apiInfo() {
//        final ApiInfoBuilder builder = new ApiInfoBuilder();
//        builder.title("My Application API through Swagger UI").version("1.0").license("(C) Copyright Test")
//        .description("List of all the APIs of My Application App through Swagger UI");
//        return builder.build();
//     }

}
