package com.example.rest.model.config;

import com.example.rest.model.AuthorizationService;
import com.example.rest.model.UserRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(name = "example.profile.dev", havingValue = "true")
    public AuthorizationService authorizationService(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }

    @Bean
    @ConditionalOnProperty(name = "example.profile.dev", havingValue = "true")
    public UserRepository userRepository() {
        return new UserRepository();
    }
}

