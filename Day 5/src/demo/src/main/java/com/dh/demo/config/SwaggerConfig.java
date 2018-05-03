package com.dh.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by jhonny on 6/3/17.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dh.demo.web"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);

    }

    private ApiInfo apiInfo() {
        return new ApiInfo("WebSis Api",
                "this a api",
                "1.0",
                "urn:tos",
                ApiInfo.DEFAULT_CONTACT,
                "Apache 2.0",
                "http");
    }

}
