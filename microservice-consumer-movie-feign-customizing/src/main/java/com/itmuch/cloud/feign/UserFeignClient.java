package com.itmuch.cloud.feign;

import com.itmuch.cloud.config.FooConfigurationForUserPassword;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "xxxx", url = "http://localhost:8761/erueka",configuration = FooConfigurationForUserPassword.class)
public interface UserFeignClient {

    @RequestMapping(value = "/eureka/apps/{serviceName}")
    String findServiceInfoFromEurekaByServiceName (@PathVariable("serviceName") String  serviceName);
}
