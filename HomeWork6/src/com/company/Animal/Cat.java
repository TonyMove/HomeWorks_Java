package com.company.Animal;

public class Cat extends Animal {

    public Cat(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);

    }

    @Override
    public void run (int length){
        if (runMaximumLength >= length) {
            System.out.println("Кот " + name + " пробежал всю дистанцию - " + length + " м");
        } else {
            System.out.println("Кот " + name + " не может пробежать " + length + " м");
        }
    }

        @Override
        public void swim (int length){
            System.out.println("Коты не умеют плавать");

        }
    }



