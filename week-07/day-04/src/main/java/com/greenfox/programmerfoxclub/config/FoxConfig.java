package com.greenfox.programmerfoxclub.config;

import com.greenfox.programmerfoxclub.model.Drinks;
import com.greenfox.programmerfoxclub.model.Foods;
import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.Tricks;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

    @Bean
    public Fox fox() {
    return new Fox("Mr. Green", Foods.SALAD, Drinks.WATER, new ArrayList<Tricks>() {
    });
    }
}
