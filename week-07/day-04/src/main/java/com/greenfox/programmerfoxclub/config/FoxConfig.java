package com.greenfox.programmerfoxclub.config;

import com.greenfox.programmerfoxclub.model.DrinkEnums;
import com.greenfox.programmerfoxclub.model.Foods;
import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.Tricks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

    @Bean
    public Fox fox() {
        List<Tricks> tricksList = new ArrayList<>();
    return new Fox("Mr. Green", Foods.SALAD, DrinkEnums.WATER, tricksList) {
    };
    }


}
