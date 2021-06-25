public class InsertionSort {
    public static int[] sort(int[] array) {
        int key, j;

        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i-1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }
}
