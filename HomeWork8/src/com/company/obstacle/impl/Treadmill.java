package com.company.obstacle.impl;

import com.company.athlete.Athlete;
import com.company.obstacle.Obstacle;

public class Treadmill implements Obstacle {

    private final int runDistance;

    public Treadmill(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public boolean action(Athlete athlete) {
        return athlete.run(runDistance);
    }

    public int getRunDistance() {
        return runDistance;
    }
}
