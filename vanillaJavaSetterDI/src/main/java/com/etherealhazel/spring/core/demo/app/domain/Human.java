package com.etherealhazel.spring.core.demo.app.domain;

public class Human {
    
    public Pants pants;
    
    public Human() {
        
    }

    public void goOutside() {
        System.out.println("I want to go outside, better put on some pants!");
        pants.wear();
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }   

}
