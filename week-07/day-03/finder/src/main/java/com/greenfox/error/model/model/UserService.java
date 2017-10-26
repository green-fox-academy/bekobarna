package com.greenfox.error.model.model;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;

/**
 * Created by aze on 25/10/17.
 */
public class UserService {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public UserService service() {
        return new UserService();
    }
}
