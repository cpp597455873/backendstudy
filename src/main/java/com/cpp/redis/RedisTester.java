package com.cpp.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * Created by cpp on 2018/4/4.
 */
public class RedisTester {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.54", 6379);
        jedis.connect();
        print(jedis.keys("*"));
        print(jedis.llen("k1"));
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
