package com.cpp.mybatis.mapper;

import com.cpp.mybatis.model.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentInterfaceMapper {

    @Select("select * from students")
    @Results({@Result(property = "className", column = "class")})
    List<Students> listStudent();


    @Select("select * from students where sno = #{sno}")
    @Results({@Result(property = "className", column = "class")})
    Students findOne(int sno);
}
