package io.javabrains.javacollections;

// Implement the BankQueue class and methods. Look at the main method
// for clues on what the methods need to do

class BankQueue {

    public void addCustomer(String customerName) {
        throw new RuntimeException("Not implemented");
    }

    //
    public String removeNextCustomer() {
        throw new RuntimeException("Not implemented");
    }

    public int getNumCustomers() {
        throw new RuntimeException("Not implemented");
    }

    public String peekNextCustomer() {
        throw new RuntimeException("Not implemented");
    }

    public String peekLastCustomer() {
        throw new RuntimeException("Not implemented");
    }

    public void displayCustomers() {
        throw new RuntimeException("Not implemented");
    }
}

public class BankQueueExercise {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();

        // Add some customers to the queue
        queue.addCustomer("Christie");
        queue.addCustomer("Rowling");
        queue.addCustomer("Steel");

        // Display the number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());

        // Display the name of the next customer in the queue
        System.out.println("Next customer in the queue: " + queue.peekNextCustomer());

        // Display the name of the last customer in the queue
        System.out.println("Last customer in the queue: " + queue.peekLastCustomer());

        // Display the names of all the customers in the queue
        System.out.println("Customers in the queue:");
        queue.displayCustomers();

        // Remove the next customer from the front of the queue
        String nextCustomer = queue.removeNextCustomer();
        System.out.println("Removed customer: " + nextCustomer);

        // Display the updated number of customers in the queue
        System.out.println("Number of customers in the queue: " + queue.getNumCustomers());
    }
}
