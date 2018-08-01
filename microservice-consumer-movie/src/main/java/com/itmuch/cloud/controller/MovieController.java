package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * getmapping 组合注解,由spring 4.3提供的
     * */
    @GetMapping("/movie/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id){
        return this.restTemplate.getForEntity("http://localhost:7900/simple/"+id,User.class);
    }
}
