package com.jk.service;

import com.jk.entity.User;

import java.util.List;

public interface UserService {
    List<User> findList();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);

    User findById(Integer userId);
}
