package com.arka.krushakservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class KrushakServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrushakServiceApplication.class, args);
    }

}
