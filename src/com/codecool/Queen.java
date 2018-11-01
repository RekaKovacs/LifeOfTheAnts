package com.codecool;

import java.util.Random;

public class Queen extends Ant {
    protected static Integer counter = 1;
    Random rnd = new Random();
    protected boolean isMoodMating = iniMoodMating();
    protected Integer counterMoodMating = iniCounterMoodMating();

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
        if (counterMoodMating == 0) {
            isMoodMating = true;
            counterMoodMating = rnd.nextInt(101) + 100;
        } else {
            counterMoodMating--;
            isMoodMating = false;
        }
    }

    public boolean iniMoodMating() {
        return rnd.nextBoolean();
    }

    public Integer iniCounterMoodMating() {
        return rnd.nextInt(101) + 100;
    }

}
