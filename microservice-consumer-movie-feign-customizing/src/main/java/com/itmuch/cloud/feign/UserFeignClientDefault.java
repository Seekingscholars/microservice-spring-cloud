package com.itmuch.cloud.feign;

import com.itmuch.cloud.config.FooConfigurationDefault;
import com.itmuch.cloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",configuration = FooConfigurationDefault.class)
public interface UserFeignClientDefault {
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/simple/postUser",method = RequestMethod.POST)
    User postUser(@RequestBody User user);

    //请求不会成功. 只要参数是负复杂对象,即使指定get方法,feign依然会已post方法进行请求
    @RequestMapping(value = "/simple/getUser",method = RequestMethod.GET)
    User getUser(@RequestBody User user);
}
