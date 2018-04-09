package com.cpp.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cpp on 2018/3/1.
 */
@RestController
public class MyBatisController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user) {
        userMapper.insertUser(user);
        return userMapper.allUser();
    }

    @PostMapping("/deleteUser/{id}")
    public List<User> deleteUser(@PathVariable int id) {
        userMapper.deleteUser(id);
        return userMapper.allUser();
    }

    @PostMapping("/updateUser")
    public List<User> deleteUser(@RequestBody User user) {
        userMapper.updateUser(user);
        return userMapper.allUser();
    }

    @GetMapping("/getUser/{id}")
    public Object getUser(@PathVariable int id) {
        return userMapper.getUser(id);
    }

    @GetMapping("/allUser")
    public List<User> allUser() {
        return userMapper.allUser();
    }


    @GetMapping("/allStudent")
    public List<User> allStudent() {
        return userMapper.allUser();
    }




}
