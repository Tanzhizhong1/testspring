package com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @program: testspring
 * @description:
 * @author: 啦啦啦
 * @create: 2021-04-05 09:40
 */
@Configuration
@ComponentScan(basePackages = {"com.huwei","com.mimi"})


public class AppConfig {

    @Bean
    public Random r(){
        return new Random();
    }
}
