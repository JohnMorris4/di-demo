package com.morrisje.services;

import org.springframework.stereotype.Service;

/**
 * Created by jmorris on 12/5/18
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I was injected by the ConstructorGreetingService";
    }
}
