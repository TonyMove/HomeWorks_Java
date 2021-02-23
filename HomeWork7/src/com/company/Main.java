package com.company;


public class Main {
    public static void main ( String [] args ) {
        Cat catBarsik = new Cat ( "Barsik" , 15 );
        Cat catMursik = new Cat ("Mursik", 17);
        Cat catTimka = new Cat ("Timka", 20);
        Cat catMusya = new Cat ("Musya", 25);
        Cat catVaska = new Cat ("Vaska", 25);
        Plate plate = new Plate ( 100 );
        plate.info ();

        catBarsik.eat (plate);
        catMursik.eat (plate);
        catTimka.eat (plate);
        catMusya.eat (plate);
        catVaska.eat (plate);

        plate.info ();
    }
}
