package com.codecool;

import java.util.Random;

public class Ant {
    protected Integer positionX;
    protected Integer positionY;
    protected String name;


    public void step(int direction) {
        switch (direction) {
            case 1: this.positionX++;
                break;
            case 2: this.positionY++;
                break;
            case 3: this.positionX--;
                break;
            case 4: this.positionY--;
                break;
        }
    }

    public void createName(int counter) {
        this.name = this.getClass() + "_" + counter;
    }

    public void iniPosition() {
        Random rnd = new Random();
        positionX = rnd.nextInt(100) + 1;
        positionY = rnd.nextInt(100) + 1;
    }

    public void move(){
    }

    public void moveAndMate(boolean isMootMating) {
    }

    public void doTask() {
        this.move();
        System.out.println("My name: " + this.name + " My position: " + this.positionX + ", " + this.positionY
                + " My distance: " + (this.positionX + this.positionY));
    }
}
