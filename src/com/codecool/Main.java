package com.codecool;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the World of Ants!");
        Colony colony = new Colony();
        colony.layOutAnts();

        int step = 101;
        for (int i = 1; i < step; i++) {
            System.out.println("number of steps " + i);
            colony.doTaskAllAnts();
        }
    }
}
