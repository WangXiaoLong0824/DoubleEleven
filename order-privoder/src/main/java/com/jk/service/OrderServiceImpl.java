package com.jk.service;

import com.jk.dao.OrderMapper;
import com.jk.entity.Order;
import com.jk.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;
    @Override
    public List<Order> findList() {
        return orderMapper.findList();
    }

    @Override
    public void addOrder(Order order) {
        if(order.getOrderId()==null){
            orderMapper.addOrder(order);
        }else{
            orderMapper.updateOrder(order);
        }

    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderMapper.deleteOrder(orderId);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);
    }

    @Override
    public Order findById(Integer orderId) {
        return orderMapper.findById(orderId);
    }
}
