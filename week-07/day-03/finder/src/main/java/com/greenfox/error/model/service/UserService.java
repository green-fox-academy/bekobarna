package com.greenfox.error.model.service;

import com.greenfox.error.model.User;
import java.util.ArrayList;

public class UserService {

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

}
