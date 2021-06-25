import java.util.Random;
import java.util.Arrays;

public class Ex8 {
    public static void main (String[] Args) {
        System.out.println("Задан случайный массив. Определить разность между суммой значений элементов\n" +
                "массива на участках, где элементы монотонно возрастают (каждое следующее число\n" +
                "больше предыдущего) и суммой значений элементов массива на участках, где\n" +
                "элементы монотонно убывают (каждое следующее число меньше предыдущего).");

        //int[] array = randArray(10);
        int[] array = {1,3,6,7,5,4,4,4,3,7,5,7,7,8};

        int incSum = 0, decSum = 0;
        boolean lastInc = false, lastDec = false;

        for (int i=0; i<array.length-1; i++) {
            if (array[i]<array[i+1]) {
                incSum += array[i];
                System.out.println("incSum+"+array[i]);
                lastInc = true;
            }
            else if (lastInc) {
                incSum += array[i];
                System.out.println("incSumLast+"+array[i]);
                lastInc = false;
            }
            if (array[i]>array[i+1]) {
                decSum += array[i];
                System.out.println("decSum+"+array[i]);
                lastDec = true;
            }
            else if (lastDec) {
                decSum += array[i];
                System.out.println("decSumLast+"+array[i]);
                lastDec = false;
            }
            if(i==array.length-2) {
                if(array[i+1]>array[i])
                    incSum+=array[i+1];
                if(array[i+1]<array[i])
                    decSum+=array[i+1];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Сумма возрастающих участков: " + incSum + ", сумма убывающих участков: " + decSum);
    }

    public static int[] randArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
