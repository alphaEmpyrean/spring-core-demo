package com.etherealhazel.spring.core.demo.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {
    
    public Pants pants;
    
    public Human() {
    }

    @Autowired
    public Human(@Qualifier("cargoPants") Pants pants) {
        this.pants = pants;
    }

    public void goOutside() {
        System.out.println("I want to go outside, better put on some pants!");
        pants.wear();
    }

}
