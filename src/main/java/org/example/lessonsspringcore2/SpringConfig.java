package org.example.lessonsspringcore2;

import org.example.lessonsspringcore2.model.Auto;
import org.example.lessonsspringcore2.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.lessonsspringcore2")
public class SpringConfig {
    @Bean
    public Auto auto1(Engine engine1) {
        return new Auto(11, engine1, "Audi");
    }

    @Bean
    public Auto auto2(Engine engine1) {
        return new Auto(12, engine1, "BMW");
    }
    @Bean
    public Auto auto3(Engine engine2) {
        return new Auto(13, engine2, "Priora");
    }
    @Bean
    public Engine engine1() {
        return new Engine(1, 200);
    }

    @Bean
    public Engine engine2() {
        return new Engine(2, 106);
    }
}
