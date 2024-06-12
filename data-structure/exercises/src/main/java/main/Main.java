package main;

import dataStructure.BracketBalancing;
import dataStructure.ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /**
         * 1º Problem: bracket balancing in an expression
         * <p>
         * Given any mathematical expression string, write a program to examine whether the pairs
         * and orders of "{", "}", "(", ")" and "[", "]" are correct in the given expression.
         *
         * Solution: Stack usage
         * 1. Stack opening characters;
         * 2. When identifying a closing character, unstack and check that it matches the opening;
         * 3. At the end, the stack should be empty;
         */
        BracketBalancing bracketBalancing = new BracketBalancing();

        System.out.println("################### BRACKET BALANCING ###################");
        System.out.println(bracketBalancing.solveExpression("2*(3+4+5*[2+3)]")); // false
        System.out.println(bracketBalancing.solveExpression("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]")); // true
        System.out.println("######################################");

        /**
         * 2º Problem: Reverse the first K elements of a queue
         * <p>
         * Given an integer K and a queue of integers, the task is to reverse the order of the first k elements
         * in the queue, leaving the other elements in the same relative order.
         *
         * Solution:
         *
         * 1. For the first K elements:
         *  1.1. Dequeue element X;
         *  1.2. Reorder (K - 1) elements;
         *  1.3. Queue element X up;
         * 2. For the N-K elements:
         *  2.1. Dequeue;
         *  2.2; Queue;
         */
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("################### REVERSE QUEUE ###################");
        System.out.println(ReverseQueue.reverseFirstK(queue, 3));
        System.out.println("################### ###################");
    }
}