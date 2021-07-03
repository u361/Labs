package TreeSortPackage;

public class Tree {
    private Node node;
    private int[] array;
    private int orderCounter;

    public Tree() {
        this.node = null;
    }

    public Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);

            return node;
        }

        if (value < node.getValue()) {
            node.setLeftNode(insertNode(node.getLeftNode(), value));
        }
        else {
            node.setRightNode(insertNode(node.getRightNode(), value));
        }

        return node;
    }

    public void insertValue(int value) {
        this.node = insertNode(this.node, value);
    }

    public void insertArray(int[] array) {
        for (int value : array) {
            insertValue(value);
        }

        this.array = array;
        this.orderCounter = 0;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeftNode());
            array[orderCounter] = node.getValue();
            orderCounter++;
            inOrder(node.getRightNode());
        }
    }

    public int[] getSortedArray() {
        inOrder(this.node);

        return array;
    }


}
