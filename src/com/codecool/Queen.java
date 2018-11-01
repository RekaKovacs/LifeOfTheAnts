package com.codecool;

public class Queen extends Ant {
    protected static Integer counter = 1;

    public Queen() {
        this.positionX = 0;
        this.positionY = 0;
        this.createName(counter);
        counter++;
        System.out.println("here is " + this.name);
        System.out.println("my position is: " + positionX + ", " + positionY);
    }

}
