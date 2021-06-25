import java.util.Random;

public class Ex1 {
    public static void main (String[] Args) {
        System.out.println("Заполнить одномерный массив и двумерный массив (матрицу) случайными целыми\n" +
                "числами из отрезка [-99, 99] (далее во всех остальных заданиях именно это случайные массивы и матрицы).\n" +
                "Вывести их в консоль.");

        System.out.println("Array: ");

        Random random = new Random();
        int[] randArray = new int[20];

        for (int i=0; i<randArray.length; i++) {
            randArray[i] = random.nextInt(199) - 99;
        }
        for (int i: randArray)
            System.out.print(i + " ");

        System.out.println("\n\nMatrix: ");

        int[][] randMatrix = new int[5][20];

        for(int i=0; i<randMatrix.length; i++) {
            for(int j=0; j<randMatrix[i].length; j++) {
                randMatrix[i][j] = random.nextInt(199) - 99;
            }
        }

        for (int[] i : randMatrix) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.print("\n");
        }
    }
}

