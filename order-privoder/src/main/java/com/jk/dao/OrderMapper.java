package com.jk.dao;

import com.jk.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface OrderMapper {
    @Select("select a.*,b.target_name targetName,b.target_id targetId from t_order a,t_target b where a.target_id=b.target_id")
    List<Order> findList();
    @Insert("insert into t_order(order_name,order_price,create_time,target_id) values(#{orderName},#{orderPrice},#{createTime},#{targetId})")
    void addOrder(Order order);
    @Update("update t_order set order_name=#{orderName},order_price=#{orderPrice},create_time=#{createTime},target_id=#{targetId} where order_id=#{orderId}")
    void updateOrder(Order order);
    @Delete("delete from t_order where order_id=#{orderId}")
    void deleteOrder(Integer orderId);
    @Select("select a.*,b.target_name targetName from t_order a,t_target b where a.target_id=b.target_id and a.order_id=#{orderId}")
    Order findById(Integer orderId);
}
