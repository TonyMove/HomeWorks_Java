package com.company.obstacle.impl;

import com.company.athlete.Athlete;
import com.company.obstacle.Obstacle;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean action(Athlete athlete) {
        return athlete.jump(height);
    }

    public int getHeight() {
        return height;
    }
}
