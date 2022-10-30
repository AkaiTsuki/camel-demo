package com.example.cameldemo.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfig {
    @Autowired
    private CamelContext camelContext;

    @Bean
    public ProducerTemplate producerTemplate() {
        return camelContext.createProducerTemplate();
    }

    @Bean
    public ConsumerTemplate consumerTemplate() {
        return camelContext.createConsumerTemplate();
    }
}
