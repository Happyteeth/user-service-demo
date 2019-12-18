package com.leyou.example.userservicedemo.mapper;

import com.leyou.example.userservicedemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{ }