import java.util.Random;

public class Ex2 {
    public static void main(String[] Args) {
        System.out.println("Дан случайный массив из 19 элементов. Найти сумму элементов, расположенных до\n" +
                "первого встреченного слева отрицательного элемента. Если отрицательных элементов\n" +
                "нет, то выдать соответствующее сообщение.");

        int [] array = randArray(3);

        for (int i: array) {
            System.out.print(i + ", ");
        }

        int sum=0;
        boolean hasNegative = false;

        for (int i=0; i<array.length; i++) {
            if (array[i] >= 0)
                sum+=array[i];
            else {
                hasNegative = true;
                break;
            }
        }

        System.out.println("\nSum = " + sum);
        if (!hasNegative)
            System.out.println("Отрицательных элементов нет.");
    }

    public static int[] randArray (int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i=0; i<length; i++)
            array[i] = random.nextInt(199)-99;

        return array;
    }
}
