package main;

import dataStructure.BracketBalancing;

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
         * 1. Stack opening characters
         * 2. When identifying a closing character, unstack and check that it matches the opening
         * 3. At the end, the stack should be empty
         */
        BracketBalancing bracketBalancing = new BracketBalancing();

        System.out.println("################### BRACKET BALANCING ###################");
        System.out.println(bracketBalancing.solveExpression("2*(3+4+5*[2+3)]")); // false
        System.out.println(bracketBalancing.solveExpression("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]")); // true
        System.out.println("######################################");
    }
}