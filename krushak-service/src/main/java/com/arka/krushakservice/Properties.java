package com.arka.krushakservice;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Properties {


    public Properties(String environment) {
        this.environment = environment;
    }

    private String environment;

}
