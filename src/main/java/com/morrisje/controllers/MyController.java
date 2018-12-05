package com.morrisje.controllers;

import com.morrisje.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jmorris on 12/5/18
 */

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello from MyController");
        return greetingService.sayGreeting();

    }
}
