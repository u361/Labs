public class StupidSort {
    public static int[] sort(int[] array) {
        int i=0, temp;

        while(i<array.length-1) {
            if (array[i]>array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i=0;
            }
            else
                i++;
        }

        return array;
    }
}
