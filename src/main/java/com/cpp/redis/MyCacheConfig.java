package com.cpp.redis;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;

/**
 * Created by cpp on 2018/3/21.
 */
@Configuration
public class MyCacheConfig extends CachingConfigurerSupport {
}
