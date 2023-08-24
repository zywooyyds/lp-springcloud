package com.lp.springcloud.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: lp-springcloud
 * @BelongsPackage: com.lp.springcloud.order.config
 * @Author: lp
 * @CreateTime: 2023-08-24  10:10
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}