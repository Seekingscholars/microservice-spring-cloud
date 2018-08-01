package com.itmuch.cloud.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfigurationDefault {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
