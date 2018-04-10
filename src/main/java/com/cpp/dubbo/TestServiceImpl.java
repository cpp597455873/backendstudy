package com.cpp.dubbo;

public class TestServiceImpl implements TestService {

    public TestServiceImpl() {
    }

    @Override
    public String sayHello() {
        return "sayHello from dubbo provider";
    }
}
