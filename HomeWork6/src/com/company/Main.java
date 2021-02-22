package com.company;

import com.company.Animal.Animal;
import com.company.Animal.Cat;
import com.company.Animal.Dog;

public class Main {


    public static void main(String[] args) {
	Animal catBarsik = new Cat("Барсик",200,0);
	Animal catMursik = new Cat("Мурзик",200,0);
	Animal dogDruzhok = new Dog("Дружок", 500, 10);
	Animal dogPalcan = new Dog("Палкан", 500, 10);

	catBarsik.run(199);
	catBarsik.run(200);
	catBarsik.swim(20);
	catMursik.run(201);
	catMursik.swim(10);

	dogDruzhok.run(499);
	dogDruzhok.run(500);
	dogDruzhok.swim(9);
	dogDruzhok.swim(10);
	dogPalcan.run(501);
	dogPalcan.swim(11);
        }

    }
