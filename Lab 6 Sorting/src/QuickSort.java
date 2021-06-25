public class QuickSort {
    public static int[] sort(int[] array) {
        quickSort(array, 0, array.length-1);

        return array;
    }

    public static void quickSort(int [] array, int left, int right) {
        if (left >= right)
            return;

        int pivotIndex = left+(right-left)/2;
        int pivot = array[pivotIndex];
        int leftIndex = left, rightIndex = right;

        while (leftIndex <= rightIndex) {
            if (array[leftIndex] < pivot)
                leftIndex++;
            else if (array[rightIndex] > pivot)
                rightIndex--;
            else {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }

        quickSort(array, left, rightIndex);
        quickSort(array, leftIndex, right);
    }



}
