package com.max.production;

public class Dog extends Animal implements IAnimal {
    public Dog() {
        this.voice();
    }

    public void voice() {
        System.out.println("Bark!");
    }
}
