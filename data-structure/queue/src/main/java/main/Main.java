package main;

import dataStructure.Queue;

import java.util.Random;

/**
 * Problem situation: Attendance Queue
 * <p>
 * Imagine you're developing a customer service system for a store.
 * Create a Java program that simulates the service line, where customers
 * enter the queue and are attended one by one.
 */
public class Main {
    public static void main(String[] args) {
//        Queue queue = new Queue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        queue.getFirstNode();
//        queue.getLastNode();
//        queue.getLength();
//
//        queue.print();
//
//        System.out.println("Dequeued node: " + queue.dequeue().getValue());
//
//        queue.print();

        int n = 5;
        var random = new Random();
        int customer = random.nextInt(101);

        Queue queue = new Queue(customer);

        System.out.println("Customer " + customer + " has arrived");

        for (int i = 2; i <= n; i++) {
            customer = random.nextInt(101);

            System.out.println("Customer " + customer + " has entered");

            queue.enqueue(customer);
        }

        var node = queue.dequeue();

        while (node != null) {
            System.out.println("Customer " + node.getValue() + " has been attended to");
            node = queue.dequeue();
        }
    }
}