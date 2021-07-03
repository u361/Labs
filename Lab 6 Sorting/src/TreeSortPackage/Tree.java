package TreeSortPackage;

public class Tree {
    Node node;

    public Tree() {
        this.node = null;
    }

    public Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);

            return node;
        }

        if (value < node.getValue()) {
            node.leftNode = insertNode(node.leftNode, value);
        }
        else {
            node.rightNode = insertNode(node.rightNode, value);
        }

        return node;
    }

    public void insertValue(int value) {
        this.node = insertNode(this.node, value);
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftNode);
            System.out.println(node.getValue());
            inOrder(node.rightNode);
        }
    }
}
