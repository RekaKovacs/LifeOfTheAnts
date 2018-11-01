package com.codecool;

import java.util.Random;

public class Worker extends Ant {
    protected static Integer counter = 1;

    public Worker() {
        this.createName(counter);
        counter++;
        this.iniPosition();
        System.out.println("here is " + this.name);
        System.out.println("my position is: " + positionX + ", " + positionY);
    }

    public void move() {
        Random rnd = new Random();
        int direction = rnd.nextInt(3) + 1;
        this.step(direction);
    }

}
