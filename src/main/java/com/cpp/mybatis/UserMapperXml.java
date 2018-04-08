package com.cpp.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapperXml {
//    void insertUser(User user);
//
//    User getUser(int id);

    List<User> allUser();

//    void deleteUser(int id);
//
//    void updateUser(User user);
}