package com.company;

import java.sql.SQLOutput;

public class Plate {
        private int amountOfFood;

        public Plate (int amountOfFood) {
            this.amountOfFood = amountOfFood;
        }

        public boolean decreaseFood (int amountOfFoodEaten) {
            if (hasEnoughFood(amountOfFoodEaten)) {
                amountOfFood -= amountOfFoodEaten;
                return true;
            }
            return false;

            }

        public boolean hasEnoughFood (int requiredAmountOfFood) {
            return amountOfFood >= requiredAmountOfFood;
            }

        public void info () {
            System.out.println ("plate: " + amountOfFood);
        }

        public void addFood (int countFood) {
            amountOfFood += countFood;
        }
    }
