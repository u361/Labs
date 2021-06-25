public class CountSort {
    public static int[] sort(int[] array) {
        int max = array[0], min = array[0];

        for (int element : array) {
            if (element < min)
                min = element;

            if (element > max)
                max = element;
        }

        int countingArrayLength = max - min + 1;
        int[] countingArray = new int[countingArrayLength];

        for (int i = 0; i < array.length; i++)
                countingArray[array[i] - min]++;

        int j = 0, i = 0;
        while(i < array.length)
            if (countingArray[j] > 0) {
                array[i] = j + min;
                countingArray[j]--;
                i++;
            }
            else
                j++;

        return array;
    }
}
