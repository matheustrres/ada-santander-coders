package main;

import dataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Element 1");

        list.append("Element 2");
        list.append("Element 3");
        list.prepend("Element 0");

        list.insertNode(3, "Element 2.5");

        // System.out.println("Node: " + list.getNode(2).data);

        // System.out.println(list.removeFirst());
        // System.out.println(list.removeLast());

        list.removeNode(1);

        list.getHead();
        list.getTail();
        list.getLength();

        list.setNode(1, "Element 0.5");

        list.print();
    }
}