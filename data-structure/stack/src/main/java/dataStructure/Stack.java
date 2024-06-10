package dataStructure;

public class Stack {
    private Node topNode;
    private int height;

    public static class Node {
        private final int value;
        public Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Stack(int value) {
        topNode = new Node(value);
        height = 1;
    }

    public void getTopNode() {
        if (topNode == null) {
            System.out.println("Empty stack");
        } else {
            System.out.println("Top node: " + topNode.value);
        }
    }

    public void getHeight() {
        System.out.println("Stack height: " + height);
    }

    public void print() {
        System.out.println("##################################");

        Node tempNode = topNode;

        while (tempNode != null) {
            System.out.println(tempNode.value);

            tempNode = tempNode.nextNode;
        }

        System.out.println("##################################");
    }

    public void push(int value) {
        Node newNode = new Node(value);

        if (height == 0) {
            topNode = newNode;
        } else {
            newNode.nextNode = topNode;
            topNode = newNode;
        }

        incrementHeight();
    }

    public Node pop() {
        if (height == 0) return null;

        Node tempNode = topNode;
        topNode = topNode.nextNode;
        tempNode.nextNode = null;

        decrementHeight();

        return tempNode;
    }

    private void incrementHeight() {
        height++;
    }

    private void decrementHeight() {
        height--;
    }
}
