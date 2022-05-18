package com.etherealhazel.spring.core.demo.app.domain;

//Here we want to use Dependecy Injection (DI) as this 
//will make the objects loosly coupled. To acheive this 
//we created a pants interface that both BlueJeans and 
//CargoPants inherit from. Then we actually inject the 
//pants object into the Human class via the Human constuctor 
//method.

public class Human {
    
    public Pants pants;
    
    public Human() {
    }

    public void goOutside() {
        System.out.println("I want to go outside, better put on some pants!");
        pants.wear();
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }


}
