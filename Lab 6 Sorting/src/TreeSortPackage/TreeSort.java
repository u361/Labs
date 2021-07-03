package TreeSortPackage;

public class TreeSort {
    public static int[] sort(int[] array) {
        Tree tree = new Tree();

        tree.insertArray(array);
        array = tree.getSortedArray();

        return array;
    }
}
