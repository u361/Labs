import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] array) {
        if (array.length>1) {
            int middleElement = array.length/2;
            int[] array1 = Arrays.copyOfRange(array, 0, middleElement);
            int[] array2 = Arrays.copyOfRange(array, middleElement, array.length);

            return merge(sort(array1), sort(array2));
        }
        else
            return array;
    }


    public static int[] merge(int[] array1, int[] array2) {
        int i1 = 0, i2 = 0, arrayLength = array1.length+array2.length; // спросить про такое форматирование
        int[] array = new int[arrayLength];

        for (int i=0; i<arrayLength; i++) {
            if (i1 == array1.length) {
                array[i] = array2[i2];
                i2++;
            }
            else if (i2 == array2.length) {
                array[i] = array1[i1];
                i1++;
            }
            else if (array1[i1] < array2[i2]) {
                array[i] = array1[i1];
                i1++;
            }
            else {
                array[i] = array2[i2];
                i2++;
            }
        }

        return array;
    }
}
