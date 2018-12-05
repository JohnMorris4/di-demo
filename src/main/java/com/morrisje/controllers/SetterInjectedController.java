package com.morrisje.controllers;

import com.morrisje.services.GreetingService;

/**
 * Created by jmorris on 12/5/18
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
