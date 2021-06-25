
public class ShakerSort {
    public static int[] sort(int[] array) {
        int left = 0, right = array.length - 1, temp;

        while (left <= right) {
            for (int i = right; i > left; --i)
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            ++left;

            for (int i = left; i < right; ++i)
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            --right;
        }

        return array;
    }
}
