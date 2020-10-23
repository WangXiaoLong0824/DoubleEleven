package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String passWord;
    private Integer typeId;
    private String typeName;
    private String createTime;
    private String gangWei;
    private String zhiZe;
}
