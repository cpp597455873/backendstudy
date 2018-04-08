package com.cpp.mybatis;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper//加上该注解才能使用@MapperScan扫描到
public interface UserMapper {
    @Insert("insert into user(username,password) values (#{username},#{password})")
    void insertUser(User user);

    @Select("select * from user where id=#{id}")
    User getUser(int id);

    @Select("select * from user order by id desc")
    List<User> allUser();

    @Update("delete from user where id=#{id}")
    void deleteUser(int id);

    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    void updateUser(User user);
}