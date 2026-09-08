package com.CollectionsExceptionHandlingAssignment1.Question4;

import java.util.LinkedList;

public class PassengerManagement {
 
    private LinkedList<String> passengerList = new LinkedList<>();

    public void addPassengerAtBeginning(String name) {
        passengerList.addFirst(name);
        System.out.println(name + " added to the front of the train.");
    }

    public void addPassengerAtEnd(String name) {
        passengerList.addLast(name);
        System.out.println(name + " added to the back of the train.");
    }

    public void removeFirstPassenger() {
        if (passengerList.isEmpty()) {
            System.out.println("No passengers to remove.");
        } else {
            String removed = passengerList.removeFirst();
            System.out.println("Removed first passenger: " + removed);
        }
    }

    public void removeLastPassenger() {
        if (passengerList.isEmpty()) {
            System.out.println("No passengers to remove.");
        } else {
            String removed = passengerList.removeLast();
            System.out.println("Removed last passenger: " + removed);
        }
    }

    public void searchPassenger(String name) {
        if (passengerList.contains(name)) {
            int position = passengerList.indexOf(name) + 1; 
            System.out.println("Passenger '" + name + "' found at coach/position: " + position);
        } else {
            System.out.println("Passenger '" + name + "' not found on the train.");
        }
    }

    public void displayPassengers() {
        if (passengerList.isEmpty()) {
            System.out.println("The train is currently empty.");
        } else {
            System.out.println("Current Passenger Manifest (Front to Back):");
            System.out.println(passengerList);
        }
    }
}
