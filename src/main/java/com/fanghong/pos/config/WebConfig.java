package com.fanghong.pos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ControllerAdvice
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        /**registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");**/

        /**registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");**/
    }
}
