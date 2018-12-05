package com.morrisje.controllers;

import com.morrisje.services.GreetingServiceImpl;

/**
 * Created by jmorris on 12/5/18
 */
public class PropertyInjectedController {
    //WHAT NOT TO DO
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();

    }

//    public GreetingServiceImpl getGreetingService() {
//        return  greetingService;
//    }
}
