package com.jk.service;

import com.jk.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "order-provider")
public interface OrderService {
    @RequestMapping("findList")
    public List<Order> findList();
    @RequestMapping("addOrder")
    public void addOrder(@RequestBody Order order);
    @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer orderId);
    @RequestMapping("findById")
    public Order findById(@RequestParam Integer orderId);
    @RequestMapping("hello")
    public String hello();
}
