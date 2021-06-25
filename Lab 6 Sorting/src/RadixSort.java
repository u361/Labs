import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[] array) {
        int max = array[0], min = array[0], numberOfDigits = 0;

        for (int element : array)
            if (element < min)
                min = element;

        if(min < 0) {
            for (int i = 0; i < array.length; i++)
                array[i] -= min;
        }

        for (int element : array)
            if (element > max)
                max = element;


        while(max > 0) {
            max /= 10;
            numberOfDigits++;
        }


        int placeValue = 1;

        while (numberOfDigits-- > 0) {
            applyCountingSortOn(array, placeValue);
            placeValue *= 10;
        }


        if(min < 0) {
            for (int n = 0; n < array.length; n++)
                array[n] += min;
        }

        return array;
    }

    private static void applyCountingSortOn(int[] array, int placeValue) {
        int range = 10; // radix or the base

        int length = array.length;
        int[] frequency = new int[range];
        int[] sortedValues = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = (array[i] / placeValue) % range;
            frequency[digit]++;
        }

        for (int i = 1; i < range; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            int digit = (array[i] / placeValue) % range;
            sortedValues[frequency[digit] - 1] = array[i];
            frequency[digit]--;
        }

        array = Arrays.copyOf(sortedValues, sortedValues.length);

        //System.arraycopy(sortedValues, 0, array, 0, length);
    }
}
