package com.greenfox.programmerfoxclub.config;

import com.greenfox.programmerfoxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

    @Bean
    public Fox fox() {
    return new Fox();
    }
}
