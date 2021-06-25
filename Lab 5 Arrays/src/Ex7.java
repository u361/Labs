import java.util.Arrays;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Дан случайный массив. Сформировать новый массив на основе данного (сохранив\n" +
                "порядок расположения элементов), но без дубликатов.");

        int[] array = randArray(10);

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
