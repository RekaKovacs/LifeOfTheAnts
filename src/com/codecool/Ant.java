package com.codecool;

public class Ant {
    protected Integer positionX;
    protected Integer positionY;
    protected Integer distance;
    protected String name;

    public Integer getDistance() {
        return Math.abs(positionX) + Math.abs(positionY);
    }
}
