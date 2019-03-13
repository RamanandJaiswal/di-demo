package rj.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    public ConstructorGreetingService() {
    }

    @Override
    public String sayGreeting() {
        return "Hello i was injected via constructor !!!";
    }
}
