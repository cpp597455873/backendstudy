package com.cpp.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

/**
 * Created by cpp on 2018/2/10.
 */
@RestController
public class RedisController {

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;


//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
//
////    @Autowired
////    private RedisTemplate<String, String> stringRedisTemplate;
//
//    @GetMapping("redistest")
//    public Object testRedis() {
//
////        List<String> strings = Arrays.asList("ddd", "dasfas", "wdxcfasdv");
////        stringRedisTemplate.opsForList().rightPush("stdudents", "cpp");
////        stringRedisTemplate.opsForList().rightPush("stdudents", "cpp11");
////        stringRedisTemplate.opsForList().rightPushAll("students",strings);
////        return stringRedisTemplate.opsForList().pop
//
////        stringRedisTemplate.opsForSet().add("name1","cpp2","cpp1");
////        stringRedisTemplate.opsForSet().add("name1","cpp3");
////        Set<String> name = stringRedisTemplate.opsForSet().members("name1");
////        return name;
//
//
////        stringRedisTemplate.opsForValue().append("name", "cpp");
////        return stringRedisTemplate.opsForValue().get("name");
//
//        User v = new User();
//        v.setName("cpp");
//        v.setPass("2222");
//        redisTemplate.opsForValue().set("user", v);
//        User latestUser = (User) redisTemplate.opsForValue().get("user");
//        return latestUser;
//    }
//
//    @GetMapping("getList1")
//    public Object getList1() {
//        Object list1 = redisTemplate.opsForList().range("list1", 0, -1);
//        return list1;
//    }
//
//    @PostMapping("saveList1")
//    public Object saveList1(@RequestParam String name) {
//        redisTemplate.opsForList().rightPush("list1", name);
//        return getList1();
//    }
//
//    @PostMapping("deleteList1")
//    public Object deleteList1(@PathVariable String data) {
//        return redisTemplate.opsForList().remove("list1", 1, data);
//    }


    @GetMapping("/useradd/{name}/{pass}")
    @CachePut(value = "user",key = "name")
    public User addOneUser(@PathVariable String name, @PathVariable String pass) {
        return new User(name, "1");
    }

    @GetMapping("/userdelete/{name}")
    @CachePut(value = "user",key = "name")
    public User deleteOneUser(@PathVariable String name) {
        return null;
    }

    @GetMapping("/userupdate/{name}/{pass}")
    @CachePut(value = "user",key = "name")
    public User updateOneUser(@PathVariable String name, @PathVariable String pass) {
        return new User(name, pass);
    }

    @GetMapping("/userfind/{name}")
    @CachePut(value = "user",key = "name")
    public User findOneUser(@PathVariable String name) {
        return new User(name, UUID.randomUUID().toString());
    }


}
