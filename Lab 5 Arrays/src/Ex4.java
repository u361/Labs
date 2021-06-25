import java.util.Random;
import java.util.Arrays;

public class Ex4 { // а если не public?
    public static void main (String[] Args) {
        System.out.println("Даны два случайных массива не обязательно одинаковой длины. Сформировать третий\n" +
                "массив из упорядоченных по возрастанию значений обоих массивов.");

        int[] array1 = randArray(4), array2 = randArray(6);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] newArray = new int[array1.length+array2.length];
        for (int i=0; i<newArray.length; i++) {
            if (i<array1.length)
                newArray[i] = array1[i];
            else
                newArray[i] = array2[i-array1.length];
        }

        System.out.println(Arrays.toString(newArray));

        int temp;

        for (int j=0; j<newArray.length-1; j++ )
            for (int i=0; i<newArray.length-1-j; i++) {
                if (newArray[i]>newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                }
            }

        System.out.println(Arrays.toString(newArray));
    }

    static int[] randArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
