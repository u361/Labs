package TreeSortPackage;

public class Node {
    private int value;
    Node leftNode;
    Node rightNode;

    public Node (int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getValue() {
        return this.value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node node) {
        this.leftNode = node;
    }

    public void setRightNode(Node node) {
        this.rightNode = node;
    }

}
