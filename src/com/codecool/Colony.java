package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Colony {

    protected int numberOfAnts = 5;
    protected List<Ant> listOfAnt;

    public Colony() {

        for (int i = 0; i < numberOfAnts; i++) {
            listOfAnt.add(new Drone());
            listOfAnt.add(new Soldier());
            listOfAnt.add(new Worker());
        }
        listOfAnt.add(new Queen());
        System.out.println("number of ants by type = " + numberOfAnts);

    }
}
