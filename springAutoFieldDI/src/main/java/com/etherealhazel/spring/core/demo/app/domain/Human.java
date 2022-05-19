package com.etherealhazel.spring.core.demo.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    
    @Autowired
    public Pants pants;
    
    public Human() {
    }    

    public void goOutside() {
        System.out.println("I want to go outside, better put on some pants!");
        pants.wear();
    }

}
