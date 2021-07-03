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
}
