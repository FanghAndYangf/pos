package com.fanghong.pos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createApi(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fanghong.pos.Controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("收银后台：用户管理 、收银机管理 、后台 APIS")
                .description("这是一个简单的文档例子")
                .termsOfServiceUrl("http://localhost/api/")
                .contact("程序员")
                .version("1.0.0")
                .build();
    }
}
