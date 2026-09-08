package com.CollectionsExceptionHandlingAssignment1.Question3;


import java.util.Stack;

public class BrowserHistory {
    Stack<String> history = new Stack<>();

    public void visitPage(String url) {
        history.push(url);
        System.out.println("Visited: " + url);
    }

    public void goBack() {
        if (history.isEmpty()) {
            System.out.println("No history to go back to.");
        } else {
            String removed = history.pop();
            System.out.println("Going back from: " + removed);
            viewCurrentPage();
        }
    }

    public void viewCurrentPage() {
        if (history.isEmpty()) {
            System.out.println("Current Page: None");
        } else {
            System.out.println("Current Page: " + history.peek());
        }
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Browser history is empty.");
        } else {
            System.out.println("Browser History (Top to Bottom): " + history);
        }
    }

   
}
