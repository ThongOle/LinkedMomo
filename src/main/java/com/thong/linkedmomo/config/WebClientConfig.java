package com.thong.linkedmomo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl("https://6077a4fb1ed0ae0017d6b0b4.mockapi.io").build();
    }
}
