package com.leyou.example.userservicedemo.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="user-service")
public class FeignUserService {

}
