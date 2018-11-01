package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Colony {

    protected int numberOfAnts = 2;
    protected List<Worker> listOfWorkers = new ArrayList<Worker>();
    protected List<Soldier> listOfSoldiers = new ArrayList<Soldier>();
    protected List<Drone> listOfDrones = new ArrayList<Drone>();


    public Colony() {

        System.out.println("number of ants by type = " + numberOfAnts);
    }

    public void layOutAnts() {
        for (int i = 0; i < numberOfAnts; i++) {
            listOfDrones.add(new Drone());
            listOfSoldiers.add(new Soldier());
            listOfWorkers.add(new Worker());
        }
        Queen queen = new Queen();
    }
}
