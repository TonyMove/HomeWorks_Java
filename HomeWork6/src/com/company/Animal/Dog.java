package com.company.Animal;

public class Dog extends Animal {

    public Dog(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);

    }

    @Override
    public void run (int length) {
        if (runMaximumLength >= length) {
            System.out.println("Собака " + name + " пробежал всю дистанцию - " + length + " м");
        } else {
            System.out.println("Собака " + name + " не может пробежать " + length + " м");
        }
    }

    @Override
    public void swim (int length) {
        if (swimMaximumLength >= length) {
            System.out.println("Собака " + name + " проплыла всю дистанцию - " + length + " м");
        } else {
            System.out.println("Собака " + name + " не может проплыть " + length + " м");
        }

    }
}



