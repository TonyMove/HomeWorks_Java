package com.company.athlete.impl;

import com.company.athlete.Athlete;

public class Human implements Athlete {

    private final int maxJumpHeight;
    private final int maxRunDistance;

    public Human(int maxJumpHeight, int maxRunDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance > maxRunDistance) {
            System.out.println("Человек не смог пробежать");
            return false;
        } else {
            System.out.println("Человек смог пробежать");
            return true;
        }
    }

    @Override
    public boolean jump(int jumpHeight) {
        if (jumpHeight > maxJumpHeight) {
            System.out.println("Человек не смог перепрыгнуть");
            return false;
        } else {
            System.out.println("Человек смог перепрыгнуть");
            return true;
        }
    }
}