package com.jk.dao;

import com.jk.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    @Select("select a.*,b.type_name typeName from t_user a,t_type b where a.type_id=b.type_id")
    List<User> findList();
    @Insert("insert into t_user(user_name,password,type_id,create_time,gangwei,zhize) values(#{userName},#{passWord},#{typeId},#{createTime},#{gangWei},#{zhiZe})")
    void addUser(User user);
    @Delete("delete from t_user where user_id=#{userId}")
    void deleteUser(Integer userId);
    @Update("update t_user set user_name=#{userName},password=#{passWord},type_id=#{typeId},create_time=#{createTime},gangwei=#{gangWei},zhize=#{zhiZe} where user_id=#{userId}")
    void updateUser(User user);
    @Select("select a.*,b.type_name typeName from t_user a,t_type b where a.type_id=b.type_id and a.user_id=#{userId}")
    User findById(Integer userId);
}
