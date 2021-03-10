package com.company;

import com.company.fruit.Apple;
import com.company.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> void swapArrayElements(T[] arr, int i1, int i2) {
        T element = arr[i2];
        arr[i2] = arr[i1];
        arr[i1] = element;
    }

    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(5, new Apple(), new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox2 = new Box<>(10, new Apple(), new Apple());
        Box<Orange> orangeBox1 = new Box<>(4, new Orange(), new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>(2);

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());

        appleBox1.putFruitsInAnotherBox(appleBox2);
//        System.out.println(orangeBox1.getWeight());
//        System.out.println(orangeBox2.getWeight());
//
//        orangeBox1.putFruitsInAnotherBox(orangeBox2);

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
//        System.out.println(orangeBox1.getWeight());
//        System.out.println(orangeBox2.getWeight());

//        appleBox1.addFruit(new Apple());
//        System.out.println(appleBox1.getWeight());


    }

}