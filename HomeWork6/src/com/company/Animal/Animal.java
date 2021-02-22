package com.company.Animal;

import com.company.Runnable;
import com.company.Swimming;

public abstract class Animal implements Runnable, Swimming {

    protected final String name;

    protected final int runMaximumLength;
    protected final int swimMaximumLength;


    public Animal(String name, int runMaximumLength, int swimMaximumLength) {
        this.name = name;
        this.runMaximumLength = runMaximumLength;
        this.swimMaximumLength = swimMaximumLength;
    }

    public String getName() {
        return name;
    }

    public int getRunMaximumLength() {
        return runMaximumLength;
    }

    public int getSwimMaximumLength() {
        return swimMaximumLength;
    }

}

