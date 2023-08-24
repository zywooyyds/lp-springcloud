package com.lp.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: lp-springcloud
 * @BelongsPackage: com.lp.springcloud
 * @Author: lp
 * @CreateTime: 2023-08-24  10:05
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);
    }
}
