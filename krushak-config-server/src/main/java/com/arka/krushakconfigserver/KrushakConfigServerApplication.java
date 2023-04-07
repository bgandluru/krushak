package com.arka.krushakconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class KrushakConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrushakConfigServerApplication.class, args);
    }

}
