package main;

import dataStructure.Stack;

/**
 * Problem scenario:
 *
 * Using a stack, invert a set of data provided by the user
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        invert(numbers);
    }

    private static void invert(int[] numbers) {
        Stack stack = new Stack(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        Stack.Node node = stack.pop();

        while (node != null) {
            System.out.println(node.getValue());

            node = stack.pop();
        }
    }
}