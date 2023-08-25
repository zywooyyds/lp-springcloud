package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: lp-springcloud
 * @BelongsPackage: com.lp.springcloud
 * @Author: lp
 * @CreateTime: 2023-08-25  09:22
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(GatewayServerApplication .class);
    }
}
