package com.etherealhazel.spring.core.demo.app.domain;

public class CargoPants implements Pants{

    public CargoPants() {
    }
    
    @Override
    public void wear() {
        System.out.println("Cargo Pants are being worn");
    }
}
