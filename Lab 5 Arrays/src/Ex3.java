import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main (String[] Args) {
        System.out.println("Дан случайный массив, состоящий из 15 элементов. Получить новый массив,\n" +
                "элементы которого определяются как разность между элементами исходного массива и суммой\n" +
                "положительных элементов заданного массива. ");
        final int LENGTH = 15;

        int[] array = randArray(LENGTH), newArray = new int[LENGTH];
        System.out.println(Arrays.toString(array));

        int positiveSum=0;
        for(int i: array)
            if (i>0)
                positiveSum+=i;

        System.out.println("Сумма положительных элементов = " + positiveSum);

        for (int i=0; i<LENGTH; i++) {
            newArray[i] = array[i]-positiveSum;
        }

        System.out.println(Arrays.toString(newArray));



    }

    public static int[] randArray (int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
