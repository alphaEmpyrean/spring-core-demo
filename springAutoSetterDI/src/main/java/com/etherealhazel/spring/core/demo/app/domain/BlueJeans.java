package com.etherealhazel.spring.core.demo.app.domain;

import org.springframework.stereotype.Component;

@Component
public class BlueJeans implements Pants{

    public BlueJeans() {
    }
    
    @Override
    public void wear() {
        System.out.println("Blue Jeans are being worn");
    }
}
