package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import com.itmuch.cloud.mapper.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @GetMapping("/simple/postUser")
    public User postUser(User user){
        return user;
    }
    @GetMapping("/simple/getUser")
    public User getUser(User user){
        return user;
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("microservice-provider-user",false);
        return instanceInfo.getHomePageUrl();
    }

    @GetMapping("/instance-info")
    public List<ServiceInstance> showInfo(){
        List<ServiceInstance> serviceInstanceList = this.discoveryClient.getInstances("microservice-provider-user");
        return serviceInstanceList;
    }

}
