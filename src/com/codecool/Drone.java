package com.codecool;

import java.util.Random;

public class Drone extends Ant {
    protected static Integer counter = 1;
    protected int hallelujahTime = 0;
    private Random rnd = new Random();

    public Drone() {
        this.createName(counter);
        counter++;
        this.iniPosition();
        System.out.println("here is " + this.name);
        System.out.println("my position is: " + positionX + ", " + positionY);
    }

    @Override
    public void moveAndMate(boolean isMoodMating) {
        if (this.positionX + this.positionY > 3) {
            if (this.positionX > 0) {
                this.positionX--;
            } else {
                this.positionX++;
            }
            if (this.positionY > 0) {
                this.positionY--;
            } else {
                this.positionY++;
            }
            System.out.println("My name: " + this.name + " My position: " + this.positionX + ", " + this.positionY
                    + " My distance: " + (this.positionX + this.positionY));
        } else {
            matingMaybe(isMoodMating);
        }
    }


    public void matingMaybe(boolean isMoodMating) {
        System.out.println("Hello, my name is " + this.name + " do you want to mate?");
        if (isMoodMating && hallelujahTime <= 10) {
            System.out.println(" HALLELUJAH " + hallelujahTime);
            hallelujahTime++;
            if (hallelujahTime > 10) {
                newPosition();
            }
        } else {
            System.out.println(" D’OH ");
            newPosition();
        }
    }

    public void newPosition() {
        this.positionX = rnd.nextInt(97) + 3;
        this.positionY = 100 - positionX;
        System.out.println("So far from Queen: " + positionX + ", " + positionY);
    }
}
