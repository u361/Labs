import java.util.Random;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Дан случайный массив. Изменить разрядность цифр, образующих элементы исходного\n" +
                "массива и, таким образом, сформировать новый массив. Например, исходный массив:\n" +
                "{25, 9, 84, -3, …}, новый массив: {52, 90, 48, -30, …}. ");

        int[] array = randArray(10);

        System.out.println(Arrays.toString(array));

        int temp=0;
        for(int i = 0; i < array.length; i++) {
            array[i] = (array[i] % 10) * 10 + array[i] / 10;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] randArray (int length) {
        Random random = new Random();

        int[] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
