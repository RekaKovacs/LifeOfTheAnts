package com.codecool;

public class Drone extends Ant {
    protected static Integer counter = 1;

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
    }


}
