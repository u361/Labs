package TreeSortPackage;

public class TreeSort {
    public static int[] sort(int[] array) {
        Tree tree = new Tree();

        for (int value : array) {
            tree.insertValue(value);
        }

        tree.inOrder(tree.node);

        return array;
    }
}
