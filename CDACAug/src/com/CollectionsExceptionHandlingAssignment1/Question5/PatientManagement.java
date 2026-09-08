package com.CollectionsExceptionHandlingAssignment1.Question5;

import java.util.ArrayDeque;
import java.util.Deque;

public class PatientManagement {

    
    private Deque<String> patientQueue = new ArrayDeque<>();
    
    public void addPatient(String name) {
        patientQueue.offer(name); 
        System.out.println("Patient '" + name + "' successfully added.");
    }

    public void treatPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients waiting.");
        } else {
            String treatedPatient = patientQueue.poll(); // Removes from the front
            System.out.println("Now treating patient: " + treatedPatient);
        }
    }

    public void viewNextPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Next patient: " + patientQueue.peek()); 
        }
    }

    public void displayPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("There are no patients.");
        } else {
            System.out.println("Waiting Queue: " + patientQueue);
        }
    }

    public boolean isEmpty() {
        return patientQueue.isEmpty();
    }
}