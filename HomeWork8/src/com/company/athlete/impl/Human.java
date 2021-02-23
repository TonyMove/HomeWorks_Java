package com.company.athlete.impl;

import com.company.athlete.Athlete;

public class Human implements Athlete {

    private final String name;
    private final int maxJumpHeight;
    private final int maxRunDistance;

    public Human(String name, int maxJumpHeight, int maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance > maxRunDistance) {
            System.out.println("Человек " + name + "  не смог пробежать и выбывает");
            return false;
        } else {
            System.out.println("Человек " + name + " смог пробежать");
            return true;
        }
    }

    @Override
    public boolean jump(int jumpHeight) {
        if (jumpHeight > maxJumpHeight) {
            System.out.println("Человек " + name + " не смог перепрыгнуть и выбывает");
            return false;
        } else {
            System.out.println("Человек " + name + " смог перепрыгнуть");
            return true;
        }
    }
}