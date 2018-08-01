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

import java.util.Arrays;
import java.util.List;

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

    /***
     *
     *
     */
    @GetMapping("/list-all")
    public List<User> listAll(){
        /**
         * wrong 所有接受数据之后,应用数组
         * */
        List<User> userList = this.restTemplate.getForObject("http://microservice-provider-user-ribbon/list-all",List.class);
        /*for (User user: userList){
            System.out.println(user.getName());
        }*/
        /**
         * right
         * */
        User[] users = this.restTemplate.getForObject("http://microservice-provider-user-ribbon/list-all",User[].class);
        userList = Arrays.asList(users);
        for (User user: userList){
            System.out.println(user.getUsername());
        }
        return userList;
    }
}
