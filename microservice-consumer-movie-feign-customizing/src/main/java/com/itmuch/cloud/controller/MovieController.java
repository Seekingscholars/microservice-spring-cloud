package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import com.itmuch.cloud.feign.UserFeignClient;
import com.itmuch.cloud.feign.UserFeignClientDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserFeignClientDefault userFeignClientDefault;
    @Autowired
    private UserFeignClient userFeignClient;

    /**
     * getmapping 组合注解,由spring 4.3提供的
     * */
    @GetMapping("/movie/{serviceName}")
    public String findById (@PathVariable("serviceName") String serviceName){
        return userFeignClient.findServiceInfoFromEurekaByServiceName(serviceName);
    }

    /**
     * getmapping 组合注解,由spring 4.3提供的
     * */
    @GetMapping("/movie/default/{id}")
    public User findByIdDefault (@PathVariable("id") Long id){
        return userFeignClientDefault.findById(id);
    }
}
