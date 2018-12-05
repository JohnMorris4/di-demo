package com.morrisje.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jmorris on 12/5/18
 */
@Service
@Profile("es")
@Primary
public class PirmarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PirmarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getSpanishGreeting();
    }
}
