package com.cpp.mybatis.mapper;

import com.cpp.mybatis.model.Students;

import java.util.List;

public interface StudentMapper {
    List<Students> listStudent();

    Students findOne(String sno);
}
