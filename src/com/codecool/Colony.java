package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Colony {

    protected int numberOfAnts = 2;
    protected List<Worker> listOfWorkers = new ArrayList<Worker>();
    protected List<Soldier> listOfSoldiers = new ArrayList<Soldier>();
    protected List<Drone> listOfDrones = new ArrayList<Drone>();
    protected Queen queen;
    protected List<Ant> listAllAnts;


    public Colony() {

        System.out.println("number of ants by type = " + numberOfAnts);
    }

    /**
     * szerettem volna, ha paraméterben átadott számmal és objectummal létre hozni a listákat, de nem ment
     */
    public void layOutAnts() {
        for (int i = 0; i < numberOfAnts; i++) {
            listOfDrones.add(new Drone());
            listOfSoldiers.add(new Soldier());
            listOfWorkers.add(new Worker());
        }
        queen = new Queen();
    }

    public void doTaskAllAnts() {
        createListContainAllAnts();
        for (Ant ant : listAllAnts) {
            ant.doTask();
        }
    }

    public  void createListContainAllAnts() {
        listAllAnts = new ArrayList<Ant>();
        listAllAnts.addAll(listOfWorkers);
        listAllAnts.addAll(listOfSoldiers);
        listAllAnts.addAll(listOfDrones);
        listAllAnts.add(queen);
    }
}
