package com.company;

import com.company.athlete.Athlete;
import com.company.athlete.impl.Cat;
import com.company.athlete.impl.Human;
import com.company.athlete.impl.Robot;
import com.company.obstacle.Obstacle;
import com.company.obstacle.impl.Treadmill;
import com.company.obstacle.impl.Wall;

public class Main {

    public static void main(String[] args) {
        Athlete [] athletes = {
                new Human("Pavel",20,200),
                new Human("Oleg",25,150),
                new Robot("000111",10, 300),
                new Robot("111000",15, 250),
                new Cat("Barsik",35, 500),
                new Cat("Snejok",30, 400)
        };

        Obstacle [] obstacles = {
                new Wall(10),
                new Treadmill(100),
                new Wall(15),
                new Treadmill(150),
                new Wall(20),
                new Treadmill(200),
                new Wall(25),
                new Wall(34),
                new Treadmill(250),
                new Wall(30),
                new Treadmill(501)

        };
            result(athletes, obstacles);
    }

    private static void result (Athlete[] athletes, Obstacle[] obstacles) {
        for (int i = 0; i < obstacles.length; i++) {

            System.out.println("----Испытание № " + (i + 1) + " ----");

            for (int j =0; j < athletes.length; j++) {

                if (athletes[j] != null) {
                    Athlete athlete = athletes[j];
                    boolean isCoped = obstacles[i].action(athlete);

                    removeAthleteIfWeak(athletes, j, isCoped);
                }
            }
        }
    }

    private static void removeAthleteIfWeak(Athlete[] athletes, int athleteIndex, boolean isCoped) {
        if (!isCoped) {
            athletes[athleteIndex] = null;
        }
    }

}
