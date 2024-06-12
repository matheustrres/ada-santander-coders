package dataStructure;

public class BinarySearchTree {
    public Node rootNode;

    public static class Node {
        private int value;
        public Node leftNode;
        public Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void insertNode(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);
        } else {
            insertNode(rootNode, value);
        }
    }

    // left - root - right
    public void inOrder() {
        inOrder(rootNode);
    }

    public boolean containsNode(int value) {
        return containsNode(rootNode, value);
    }

    public int getNodeMinValue(Node currentNode) {
        while (currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }

        return currentNode.getValue();
    }

    public void deleteNode(int value) {
        rootNode = deleteNode(rootNode, value);
    }

    private void insertNode(final Node rootNode, int value) {
        if (rootNode == null) return;
        if (value == rootNode.value) return;

        if (value > rootNode.value) {
            if (rootNode.rightNode == null) {
                rootNode.rightNode = new Node(value);
            } else {
                insertNode(rootNode.rightNode, value);
            }
        } else {
            if (rootNode.leftNode == null) {
                rootNode.leftNode = new Node(value);
            } else {
                insertNode(rootNode.leftNode, value);
            }
        }
    }

    // left - root - right
    private void inOrder(final Node node) {
        if (node == null) return;

        inOrder(node.leftNode);
        System.out.println(node.value);
        inOrder(node.rightNode);
    }

    private boolean containsNode(final Node rootNode, int value) {
        if (rootNode == null) return false;
        if (rootNode.value == value) return true;

        if (value > rootNode.value) {
            return containsNode(rootNode.rightNode, value);
        } else {
            return containsNode(rootNode.leftNode, value);
        }
    }

    private Node deleteNode(Node rootNode, int value) {
        if (rootNode == null) return null;

        if (value < rootNode.value) {
            rootNode.leftNode = deleteNode(rootNode.leftNode, value);
        } else if (value > rootNode.value) {
            rootNode.rightNode = deleteNode(rootNode.rightNode, value);
        } else {
            if (isLeaf(rootNode)) {
                return null;
            } else if (rootNode.leftNode == null) {
                return rootNode.rightNode;
            } else if (rootNode.rightNode == null) {
                return rootNode.leftNode;
            } else {
                int minValue = getNodeMinValue(rootNode.rightNode);

                rootNode.value = minValue;
                rootNode.rightNode = deleteNode(rootNode.rightNode, minValue);

                return rootNode;
            }
        }

        return rootNode;
    }

    private boolean isLeaf(Node node) {
        return rootNode.leftNode == null && rootNode.rightNode == null;
    }
}
