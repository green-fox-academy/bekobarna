package com.greenfox.colors.Config;

import com.greenfox.colors.Model.GreenColor;
import com.greenfox.colors.Model.RedColor;
import org.springframework.context.annotation.Bean;

public class ColorsConfiguration {

    @Bean
    public RedColor redColor () {
        return new RedColor();
    }

    @Bean
    public GreenColor greenColor () {
        return new GreenColor();
    }

}
