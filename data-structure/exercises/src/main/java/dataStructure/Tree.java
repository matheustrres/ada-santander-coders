package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node rootNode;

    public static class Node {
        private final int value;
        public Node leftNode;
        public Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isLeaf() {
            return this.leftNode == null && this.rightNode == null;
        }
    }

    public void insertNode(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);
        } else {
            Node newNode = new Node(value);

            Queue<Node> nodeQueue = new LinkedList<>();
            nodeQueue.add(rootNode);

            while (!nodeQueue.isEmpty()) {
                Node currentNode = nodeQueue.remove();

                if (currentNode.leftNode == null) {
                    currentNode.leftNode = newNode;
                    break;
                } else {
                    nodeQueue.add(currentNode.leftNode);
                }

                if (currentNode.rightNode == null) {
                    currentNode.rightNode = newNode;
                    break;
                } else {
                    nodeQueue.add(currentNode.rightNode);
                }
            }
        }
    }

    // root - left - right
    // useful for in-depth search
    public void preOrder() {
        preOrder(rootNode);
    }

    // left - root - right
    public void inOrder() {
        inOrder(rootNode);
    }

    // left - right - root
    public void postOrder() {
        postOrder(rootNode);
    }

    public void wideSearch() {
        if (rootNode == null) return;

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.remove();

            if (node.leftNode != null) nodeQueue.add(node.leftNode);
            if (node.rightNode != null) nodeQueue.add(node.rightNode);

            System.out.println(node.value);
        }
    }

    // root - left - right
    private void preOrder(final Node node) {
        if (node == null) return;

        System.out.println(node.value);
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    // left - root - right
    private void inOrder(final Node node) {
        if (node == null) return;

        inOrder(node.leftNode);
        System.out.println(node.value);
        inOrder(node.rightNode);
    }

    // left - right - root
    private void postOrder(final Node node) {
        if (node == null) return;

        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.println(node.value);
    }
}