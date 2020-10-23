package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @RequestMapping("findList")
    public String findList(Model model){
        List<Order> orderList=orderService.findList();
        model.addAttribute("orderList",orderList);
        return "order";
    }
    @RequestMapping("hello")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "helloFail")
    public String hello(){
        return orderService.hello();
    }
    public String helloFail(){
        return "say:No Hello";
    }
    @RequestMapping("addOrder")
    public String addOrder(Order order){
         orderService.addOrder(order);
         return "redirect:findList";
    }

    @RequestMapping("deleteOrder")
    public String deleteOrder(Integer orderId){
        orderService.deleteOrder(orderId);
        return "redirect:findList";
    }
    @RequestMapping("findById")
    public String findById(Integer orderId,Model model){
        Order order = orderService.findById(orderId);
        model.addAttribute("order",order);
        return "addOrder";
    }
}
