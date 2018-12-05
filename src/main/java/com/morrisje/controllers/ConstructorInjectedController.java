package com.morrisje.controllers;

import com.morrisje.services.GreetingService;

/**
 * Created by jmorris on 12/5/18
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
