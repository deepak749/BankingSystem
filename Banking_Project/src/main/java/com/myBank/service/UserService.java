package com.myBank.service;

import java.util.Optional;

import com.myBank.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
