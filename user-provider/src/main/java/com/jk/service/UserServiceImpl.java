package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findList() {
        return userMapper.findList();
    }

    @Override
    public void addUser(User user) {
        if(user.getUserId()==null){
            userMapper.addUser(user);
        }else{
            userMapper.updateUser(user);
        }

    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User findById(Integer userId) {
        return userMapper.findById(userId);
    }
}
