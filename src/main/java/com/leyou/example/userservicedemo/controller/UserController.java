package com.leyou.example.userservicedemo.controller;

import com.leyou.example.userservicedemo.entity.User;
import com.leyou.example.userservicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) throws Exception {
        Thread.sleep(100000);
        return this.userService.queryById(id);
    }

    @GetMapping("/testFeign")
    public String testFeign(){
        return userService.testFeign();
    }

}