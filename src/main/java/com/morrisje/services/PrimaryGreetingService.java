package com.morrisje.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jmorris on 12/5/18
 */
@Service
@Primary
@Profile({"en", "default"}) //Sets the default profile
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getEnglishGreeting();
    }
}
