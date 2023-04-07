package com.arka.krushakservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/message")
    public String getMessage(){
        return "bharath gandluru";
    }

}
