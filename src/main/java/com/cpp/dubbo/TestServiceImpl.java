package com.cpp.dubbo;

public class TestServiceImpl implements TestService {

    public TestServiceImpl(){
        System.out.println("发阿道夫");
    }

    @Override
    public String sayHello() {
        return "helloasdfasdf";
    }
}
