package com.cpp.tester;

import com.cpp.mybatis.mapper.StudentInterfaceMapper;
import com.cpp.mybatis.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * Created by cpp on 2018/4/10.
 */
@Component
@DependsOn("startUp")
public class MyBatisTester implements InitializingBean {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    StudentInterfaceMapper studentInterfaceMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (sqlSessionFactory != null) {
            System.out.println("===>>mybatis sqlSessionFactory is have");
        } else {
            System.err.println("===>>mybatis sqlSessionFactory is null");
        }
        System.out.println("===>> mybatis test");

        //基于xml的方式
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession.getMapper(StudentMapper.class).findOne("101"));

        //基于注解的方式
        System.out.println(studentInterfaceMapper.listStudent());
        System.out.println(studentInterfaceMapper.findOne(105));

    }
}
