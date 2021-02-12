package com.company;

public class Animal {
    protected String name;
    protected int runLength;
    protected int swimLength;

    public Animal (String name, int runLength, int swimLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public int getSwimLength() {
        return swimLength;
    }

    public void setSwimLength(int swimLength) {
        this.swimLength = swimLength;
    }
}
