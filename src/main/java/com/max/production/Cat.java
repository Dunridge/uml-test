package com.max.production;

public class Cat extends Animal implements IAnimal {
    public Cat() {
        this.voice();
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
