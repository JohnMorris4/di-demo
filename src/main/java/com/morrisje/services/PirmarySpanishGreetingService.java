package com.morrisje.services;

/**
 * Created by jmorris on 12/5/18
 */

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
