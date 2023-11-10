package com.nagarro.repository;

import com.nagarro.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private final Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(Integer userId) {
        return this.users.get(userId);
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

}
