package com.morrisje.services;

import org.springframework.stereotype.Service;

/**
 * Created by jmorris on 12/5/18
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I am being called from the SetterGreetingService";
    }
}
