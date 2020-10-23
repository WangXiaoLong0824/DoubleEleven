package com.jk.controller;

import com.jk.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("toOrder")
    public  String  toOrder(){
        return "order";
    }
    @RequestMapping("toAddOrder")
    public  String  toAddOrder(Model model){
        model.addAttribute("order",new Order());
        return "addOrder";
    }
}
