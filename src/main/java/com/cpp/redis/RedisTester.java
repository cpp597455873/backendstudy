package com.cpp.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by cpp on 2018/4/4.
 */
public class RedisTester {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.connect();
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
