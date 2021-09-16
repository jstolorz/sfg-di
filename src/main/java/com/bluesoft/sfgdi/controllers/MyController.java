package com.bluesoft.sfgdi.controllers;

import com.bluesoft.sfgdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String seyHello(){
        return greetingService.sayGreeting();
    }
}
