package com.jk.controller;

import com.jk.entity.Order;
import com.jk.entity.User;
import com.jk.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @RequestMapping("findList")
    public List<Order> findList(){
        return orderService.findList();
    }
    @RequestMapping("addOrder")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }
    @RequestMapping("updateOrder")
    public void updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
    }
    @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer orderId){
        orderService.deleteOrder(orderId);
    }
    @RequestMapping("findById")
    public Order findById(@RequestParam Integer orderId){
        return orderService.findById(orderId);
    }
}
