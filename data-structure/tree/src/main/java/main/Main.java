package main;

import dataStructure.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insertNode(37);
        tree.insertNode(11);
        tree.insertNode(66);
        tree.insertNode(8);
        tree.insertNode(17);
        tree.insertNode(42);
        tree.insertNode(72);

        System.out.println(tree.rootNode.getValue());
        System.out.println(tree.rootNode.leftNode.getValue());
        System.out.println(tree.rootNode.rightNode.getValue());

        System.out.println("Is root leaf: " + tree.rootNode.isLeaf());
        System.out.println("Is root's right node leaf: " + tree.rootNode.rightNode.isLeaf());

        System.out.println("############### PRE ORDER ###############");
        tree.preOrder();
        System.out.println("###########################");

        System.out.println("############### IN ORDER ###############");
        tree.inOrder();
        System.out.println("###########################");

        System.out.println("############### POST ORDER ###############");
        tree.postOrder();
        System.out.println("###########################");

        System.out.println("############### WIDE SEARCH ###############");
        tree.wideSearch();
        System.out.println("###########################");
    }
}