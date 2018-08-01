package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    /**
     * getmapping 组合注解,由spring 4.3提供的
     * */
    @GetMapping("/movie/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id){
        ///return this.restTemplate.getForEntity("http://localhost:7900/simple/"+id,User.class);
        return this.restTemplate.getForEntity("http://microservice-provider-user/simple/"+id,User.class);
    }
    @GetMapping("/ribbonconfig/{id}")
    public  ResponseEntity<User> findByIdT (@PathVariable Long id){
        //调用那个服务. 通过eureka
        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user");
        System.out.println("two" + serviceInstance.getHost() + "" +serviceInstance.getPort() + "" + serviceInstance.getServiceId());

        serviceInstance = loadBalancerClient.choose("microservice-provider-user-two");
        System.out.println("two" + serviceInstance.getHost() + ":" +serviceInstance.getPort() + "/" + serviceInstance.getServiceId());
        return null;
    }
}
