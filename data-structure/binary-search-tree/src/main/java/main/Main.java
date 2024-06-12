package main;

import dataStructure.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertNode(37);
        tree.insertNode(11);
        tree.insertNode(66);
        tree.insertNode(8);
        tree.insertNode(17);
        tree.insertNode(42);
        tree.insertNode(72);

        System.out.println("############### IN ORDER ###############");
        tree.inOrder();
        System.out.println("###########################");

        tree.deleteNode(66);
        tree.deleteNode(8);

        System.out.println("############### IN ORDER ###############");
        tree.inOrder();
        System.out.println("###########################");

        System.out.println("Tree contains node 8: " + tree.containsNode(8));
        System.out.println("Tree contains node 17: " + tree.containsNode(17));
    }
}