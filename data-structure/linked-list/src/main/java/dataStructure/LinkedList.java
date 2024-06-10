package dataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public static final class Node {
        public String data;
        public Node nextNode;

        public Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length = 1;

        Node newNode = new Node(data);

        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if (this.head == null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("List: " + head.data);
        }
    }

    public void getTail() {
        if (this.head == null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void resetList() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        System.out.println("#################################");
        Node tempNode = this.head;

        while (tempNode != null) {
            System.out.println(tempNode.data);

            tempNode = tempNode.nextNode;
        }
        System.out.println("#################################");
    }

    public void append(String data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }

        length++;
    }

    public void prepend(String data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;

        Node preNode = head;
        Node tempNode = null;

        while (preNode.nextNode != tail) {
            preNode = preNode.nextNode;
        }

        tempNode = tail;

        tail = preNode;
        tail.nextNode = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return tempNode;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node tempNode = head;

        head = head.nextNode;
        tempNode.nextNode = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return tempNode;
    }

    public Node getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node tempNode = head;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.nextNode;
        }

        return tempNode;
    }

    public boolean insertNode(int index, String data) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(data);

            return true;
        }

        if (index == length) {
            append(data);

            return true;
        }

        Node newNode = new Node(data);
        Node tempNode = getNode(index - 1);

        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;

        length++;

        return true;
    }

    public boolean setNode(int index, String data) {
        Node tempNode = getNode(index);

        if (tempNode != null) {
            tempNode.data = data;
            return true;
        }

        return false;
    }

    public Node removeNode(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prevNode = getNode(index - 1);
        Node tempNode = prevNode.nextNode;

        prevNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = null;

        length--;

        return tempNode;
    }
}
