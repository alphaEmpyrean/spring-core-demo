package com.etherealhazel.spring.core.demo.app.domain;

//Human is 'has-a' pair of BlueJeans, therefore Human
//has a dependency on BlueJeans. In this example 
//we are instantiating the BlueJean class directly
//in the Human constructor method making these 
//'tightly-coupled'. This is not desirable as it 
//makes it impossible to switch out pants during 
//runtime and impossible to properly test the 
//goOutside() method.

public class Human {
    
    public BlueJeans blueJeans;
    
    public Human() {
        this.blueJeans = new BlueJeans();
    }

    public void goOutside() {
        System.out.println("I want to go outside, better put on some pants!");
        blueJeans.wear();
    }

}
