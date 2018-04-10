package com.cpp;

import com.cpp.mybatis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * Created by cpp on 2018/4/10.
 */
public class StartUp {


    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    /**
     * 导入spring yml的配置
     */
    @Value("${server.port}")
    int port;

    public void init() {
        System.out.println("spring执行初始化动作" + port);

        RedisCache.setJedisConnectionFactory(redisConnectionFactory);
    }
}
