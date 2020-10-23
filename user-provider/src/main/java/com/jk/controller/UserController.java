package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
     @RequestMapping("findList")
    public List<User> findList(){
        return userService.findList();
    }
    @RequestMapping("addUser")
    public void addUser(@RequestBody User user){
         userService.addUser(user);
    }
    @RequestMapping("updateUser")
    public void updateUser(@RequestBody User user){
         userService.updateUser(user);
    }
    @RequestMapping("deleteUser")
    public void deleteUser(@RequestParam Integer userId){
         userService.deleteUser(userId);
    }
    @RequestMapping("findById")
    public User findById(@RequestParam Integer userId){
        return userService.findById(userId);
    }

}
