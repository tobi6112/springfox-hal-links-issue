package com.example.demo;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@org.springframework.context.annotation.Configuration
public class Configuration {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
        .forCodeGeneration(true)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.ant("/foos/**"))
        .build();
  }
}
