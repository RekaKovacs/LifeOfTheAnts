package com.codecool;

import java.util.Random;

public class Drone extends Ant {
    protected static Integer counter = 1;
    protected Queen queen;
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
    public void move() {
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
        } else {
            matingMaybe();
        }
    }

    public void matingMaybe() {
        System.out.println("Hello, my name is " + this.name + " do you want to mate?");
        if (queen.isMoodMating && hallelujahTime <= 10) {
            System.out.println(" HALLELUJAH " + hallelujahTime);
            hallelujahTime++;
        } else if (hallelujahTime > 10) {
            newPosition();
        } else {
            System.out.println(" D’OH ");
            newPosition();
        }
    }

    public void newPosition() {
        this.positionX = rnd.nextInt(98) + 3;
        this.positionY = rnd.nextInt(100 - positionX);
        System.out.println("So far from Queen: " + positionX + ", " + positionY);
    }

// “HALLELUJAH”, stay there for 10 timesteps, and after that they are kicked off to a random point with the distance
//        of 100 steps. If they do not have luck, they say “D’OH”, and are kicked 100 steps away instantly.
}
