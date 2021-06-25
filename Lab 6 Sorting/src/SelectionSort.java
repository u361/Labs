public class SelectionSort {
    public static int[] sort(int[] array) {
        int min, minIndex, temp;

        for (int i = 0; i < array.length; i++) {
            minIndex = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        return array;
    }
}
