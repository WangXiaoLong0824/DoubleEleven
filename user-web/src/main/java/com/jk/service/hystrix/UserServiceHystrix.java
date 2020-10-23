package com.jk.service.hystrix;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public List<User> findList() {

        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public User findById(Integer userId) {
        return null;
    }
}
