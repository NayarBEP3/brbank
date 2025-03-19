package com.brbank.infrastructure.config;

import com.brbank.domain.port.CreditCardUseCases;
import com.brbank.domain.service.CreditCardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreditCardService creditCardService(final CreditCardUseCases creditCardUseCases) {
        return new CreditCardService(creditCardUseCases);
    }
}
