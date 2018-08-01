package com.itmuch.cloud.feign;

import com.itmuch.cloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/simple/postUser/",method = RequestMethod.POST)
    User postUser(User user);

    @RequestMapping(value = "/simple/getUser/",method = RequestMethod.GET)
    User getUser(User user);
}
