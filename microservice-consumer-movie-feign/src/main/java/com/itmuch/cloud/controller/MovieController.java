package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import com.itmuch.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;
    /**
     * getmapping 组合注解,由spring 4.3提供的
     * */
    @GetMapping("/movie/{id}")
    public User findById (@PathVariable Long id){
        return userFeignClient.findById(id);
    }
}
