package com.morrisje.services;

import org.springframework.stereotype.Service;

/**
 * Created by jmorris on 12/5/18
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus";

@Override
    public String sayGreeting(){
    return HELLO_GURUS;
}
}
