package com.etherealhazel.spring.core.demo.app.config;

import com.etherealhazel.spring.core.demo.app.domain.BlueJeans;
import com.etherealhazel.spring.core.demo.app.domain.CargoPants;
import com.etherealhazel.spring.core.demo.app.domain.Human;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "blueJeans")
    public BlueJeans createBlueJeans(){
        return new BlueJeans();
    }

    @Bean(name = "cargoPants")
    public CargoPants createCargoPants(){
        return new CargoPants();
    }

    @Bean(name = "human")
    public Human createHuman(){
        return new Human(createCargoPants());
    }
}