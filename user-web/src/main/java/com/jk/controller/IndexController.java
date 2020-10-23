package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("toUser")
    public String toUser(){
        return "user";
    }
    @RequestMapping("toOrder")
    public String toOrder(){
        return "order";
    }
}
