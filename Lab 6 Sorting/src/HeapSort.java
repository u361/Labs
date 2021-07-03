public class HeapSort {
    public static int[] sort(int[] array) {
        for (int i = array.length / 2 - 1; i >=0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    private static void heapify(int[] array, int length, int i) {
        int largest = i;
        int left =  2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }

        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, length, largest);
        }
    }
}
