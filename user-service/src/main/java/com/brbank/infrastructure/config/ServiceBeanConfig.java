package com.brbank.infrastructure.config;

import com.brbank.domain.port.UserUseCases;
import com.brbank.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeanConfig {

    @Bean
    public UserService userService(final UserUseCases userUseCases) {
        return new UserService(userUseCases);
    }
}
