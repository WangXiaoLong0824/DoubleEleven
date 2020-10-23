package com.jk.service;

import com.jk.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findList();

    void addOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Integer orderId);

    Order findById(Integer orderId);
}
