package com.jk.entity;

import lombok.Data;

@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private Integer orderPrice;
    private String createTime;
    private Integer targetId;
    private  String targetName;
}
