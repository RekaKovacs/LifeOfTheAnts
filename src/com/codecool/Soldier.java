package com.codecool;

public class Soldier extends Ant {
    protected static Integer counter = 1;
    int direction = 1;

    public Soldier() {
        this.createName(counter);
        counter++;
        this.iniPosition();
        System.out.println("here is " + this.name);
        System.out.println("my position is: " + positionX + ", " + positionY);
    }

    public void move() {
        if (direction == 4) {
            this.step(direction);
            direction = 1;
        } else {
            this.step(direction);
            direction++;
        }
    }
}
