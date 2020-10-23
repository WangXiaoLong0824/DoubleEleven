package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("findList")
    public List<User> findList(){
        return userService.findList();
    }
    @RequestMapping("addUser")
    public void addUser(User user){
        userService.addUser(user);
    }
    @RequestMapping("updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }
    @RequestMapping("deleteUser")
    public void deleteUser(Integer userId){
        userService.deleteUser(userId);
    }
    @RequestMapping("findById")
    public User findById(Integer userId){
        return  userService.findById(userId);
    }
}
