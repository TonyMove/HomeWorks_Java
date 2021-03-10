package com.company;

import com.company.fruit.Fruit;
import com.company.fruit.SpecificFruit;

import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit & SpecificFruit> {

    private final List<T> container;

    private int capacity;

    public Box(int capacity, T... fruits) {
        this.container = Arrays.asList(fruits);
        this.capacity = capacity;
    }

    public float getWeight() {
        float commonWeight = 0.0f;

        for (T fruit : container) {
            commonWeight += fruit.getWeight();
        }

        return commonWeight;
    }

    public boolean weightCompare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.01;
    }

    public void putFruitsInAnotherBox(Box<T> anotherBox) {
        if (anotherBox == this) return;

        int countSize = Math.min(container.size(), anotherBox.capacity);
        List<T> fruits = container.subList(0, countSize);
        anotherBox.container.addAll(fruits);
        container.removeAll(fruits);

        anotherBox.capacity -= countSize;
        capacity += countSize;
    }

    public void addFruit(T fruit) {
        if (capacity - 1 > 0) {
            container.add(fruit);
            capacity--;
        }
    }

}
