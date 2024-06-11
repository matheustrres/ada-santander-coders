package dataStructure;

public class Queue {
    private Node firstNode;
    private Node lastNode;
    private int length;

    public static class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);

        firstNode = newNode;
        lastNode = newNode;

        increaseLength();
    }

    public void getFirstNode() {
        if (firstNode != null) {
            System.out.println("First node: " + firstNode.value);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void getLastNode() {
        if (lastNode != null) {
            System.out.println("Last node: " + lastNode.value);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }

        increaseLength();
    }

    public Node dequeue() {
        if (length == 0) return null;

        Node tempNode = firstNode;

        if (length == 1) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
            tempNode.nextNode = null;
        }

        decreaseLength();

        return tempNode;
    }

    public void print() {
        System.out.println("################################");
        Node tempNode = firstNode;

        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.nextNode;
        }
        System.out.println("################################");
    }

    private void increaseLength() {
        length++;
    }

    private void decreaseLength() {
        length--;
    }
}

