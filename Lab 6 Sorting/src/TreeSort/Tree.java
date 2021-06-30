package TreeSort;

import java.util.ArrayList;

class Tree{
    Node node;
    ArrayList<Integer> arrayList = new ArrayList<>();

    Tree(int value){
        node = new Node(value);
    }

    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.value){
            node.left = insert(node.left, value);
        }

        else if(value > node.value){
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            arrayList.add(node.value);
            inOrder(node.right);
        }
    }
}