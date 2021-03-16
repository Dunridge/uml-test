package com.max.production;

/*
* Notes: (View diagram on a package﻿)
1) In the Project tool window, right-click a package for which you want to create a diagram and select
* Diagrams | Show Diagram Ctrl+Alt+Shift+U ).
2) In the list that opens, select Java Class Diagram. IntelliJ IDEA generates a UML diagram for classes and their dependencies.
*
* */

import java.util.Scanner;

public class Main {
    Animal animal =  new Animal();
    Scanner scanner = new Scanner(System.in);

    public void castObjects(int mode) {
        switch (mode) {
            case 1: {
                this.animal = new Dog();
                System.out.println("Dog");
                break;
            }
            case 2: {
                this.animal = new Bird();
                System.out.println("Bird");
                break;
            }
            case 3: {
                this.animal = new Cat();
                System.out.println("Cat");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Enter animal type:");
        obj.castObjects(obj.scanner.nextInt());
    }
}
