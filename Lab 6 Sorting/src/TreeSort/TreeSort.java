package TreeSort;

public class TreeSort {
    public static int[] sort(int[] array) {
        Tree tree = new Tree(array[0]);
        for(int num : array){
            tree.insert(tree.node, num);
        }
        tree.inOrder(tree.node);
        array = tree.arrayList.stream().mapToInt(i -> i).toArray();

        return array;
    }
}
