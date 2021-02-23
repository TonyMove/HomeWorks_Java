package com.company;


public class Main {
    public static void main ( String [] args ) {
        Cat[] cats = {
            new Cat ( "Barsik" , 15 ),
            new Cat ("Mursik", 17),
            new Cat ("Timka", 20),
            new Cat ("Musya", 25),
            new Cat ("Vaska", 25)
        };

        Plate plate = new Plate ( 100 );
        plate.info ();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
    }

}
