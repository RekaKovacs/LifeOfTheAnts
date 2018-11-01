package com.codecool;

public class Queen extends Ant {
    protected static Integer counter = 1;
    protected boolean isMoodMating = false;

    public Queen() {
        this.positionX = 0;
        this.positionY = 0;
        this.createName(counter);
        counter++;
        System.out.println("here is " + this.name);
        System.out.println("my position is: " + positionX + ", " + positionY);
    }

    @Override
    public void doTask() {

    }

}
