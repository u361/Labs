import java.util.Random;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("В случайном массиве определить индекс наибольшего из нечетных по значению положительных элементов.");

        int[] array = randArray(10);

        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i=0; i<array.length; i++)
            if(array[i]>0 && array[i]%2==1 && array[i]>max)
                max = array[i];

        System.out.println("Max = " + max);
    }

    public static int[] randArray (int length) {
        Random random = new Random();
        int [] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
