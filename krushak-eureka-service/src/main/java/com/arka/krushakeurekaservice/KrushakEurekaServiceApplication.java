package com.arka.krushakeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Adding Eureka discover capability
@EnableEurekaServer
public class KrushakEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrushakEurekaServiceApplication.class, args);
    }

}
