package com.greenfox.error.model.config;

import com.greenfox.error.model.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aze on 25/10/17.
 */

@Configuration
public class UserServiceConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
