package com.company;

public class Cat {

    private String name;

    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
        if (satiety == true) {
            System.out.println("Кот " + name + " покушал " + appetite + " и наелся");
        }
        else {
            System.out.println("Кот " + name + " остался голодный. Он хотел поесть " + appetite);
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

