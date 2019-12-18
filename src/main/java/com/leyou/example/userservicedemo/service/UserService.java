package com.leyou.example.userservicedemo.service;

import com.leyou.example.userservicedemo.entity.User;
import com.leyou.example.userservicedemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
private UserMapper userMapper;

public User queryById(Long id) {
    return this.userMapper.selectByPrimaryKey(id);
}

public String testFeign(){
    return "testFeign";
}
}