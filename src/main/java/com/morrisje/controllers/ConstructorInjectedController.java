package com.morrisje.controllers;

import com.morrisje.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jmorris on 12/5/18
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
