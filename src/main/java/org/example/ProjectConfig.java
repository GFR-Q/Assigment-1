package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    Cars cars() {
        var CarOne = new Cars();
        CarOne.setName("BMW");
        return CarOne;
    }
}

