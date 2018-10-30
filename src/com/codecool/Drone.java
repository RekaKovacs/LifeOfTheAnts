package com.codecool;

public class Drone extends Ant implements TimeStep {


    @Override
    public void timeStep() {
        if (this.distance < 3) {
            move();
        }
    }

    public void move() {
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
    }


}
