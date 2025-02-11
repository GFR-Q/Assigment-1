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
        Cars Car1 = new Cars();
        Car1.setName("BMW");
        return Car1;
    }
    @Bean
    Cars cars2() {
        Cars Car2 = new Cars();
        Car2.setName("Lexus");
        return Car2;
    }
}

