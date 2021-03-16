package com.max.production;

public class Bird extends Animal implements IAnimal {
    public Bird() {
        this.voice();
    }

    public void voice() {
        System.out.println("Tweet!");
    }
}
