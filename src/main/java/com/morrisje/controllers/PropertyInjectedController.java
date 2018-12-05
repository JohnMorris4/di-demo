package com.morrisje.controllers;

import com.morrisje.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jmorris on 12/5/18
 *
 */
@Controller
public class PropertyInjectedController {
    //WHAT NOT TO DO
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();

    }
}
