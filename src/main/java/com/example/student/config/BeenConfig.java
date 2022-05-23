package com.example.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
public class BeenConfig {

    @Bean
    public ViewResolver viewResolver(){
    InternalResourceViewResolver internalResourceViewResolver =new InternalResourceViewResolver();
    internalResourceViewResolver.setSuffix(".jsp");
    internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
    return internalResourceViewResolver;

    }

}
