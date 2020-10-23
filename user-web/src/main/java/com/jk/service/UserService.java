package com.jk.service;

import com.jk.entity.User;
import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "user-provider",fallback = UserServiceHystrix.class)
public interface UserService  {
    @RequestMapping("findList")
    public List<User> findList();
    @RequestMapping("addUser")
    public void addUser(@RequestBody User user);
    @RequestMapping("updateUser")
    public void updateUser(@RequestBody User user);
    @RequestMapping("deleteUser")
    public void deleteUser(@RequestParam Integer userId);
    @RequestMapping("findById")
    public User findById(@RequestParam Integer userId);
}
