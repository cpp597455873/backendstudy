package com.cpp.tester;

import com.cpp.dubbo.TestService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by cpp on 2018/4/10.
 */
@Component
public class DubboTester implements InitializingBean {

    @Autowired
    @Qualifier("testService")
    TestService testService;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("testService1 is null" + (testService == null));
    }
}
