import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] Args) {
        System.out.println("Написать программу, которая в случайной матрице находит все элементы, равные\n" +
                "числу, введенному с клавиатуры. Подсчитать число таких элементов.");

        int[][] matrix = randMatrix(4, 6);

        for (int i=0; i<matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int mumber = scanner.nextInt();

        int count = 0;
        for (int n=0; n<matrix.length; n++)
            for (int m=0; m<matrix[n].length; m++)
                if (matrix[n][m]==mumber) {
                    System.out.println((n+1) + " строка, " + (m+1) + " стобец");
                    count++;
                }

        System.out.println("Всего элементов: " + count);
    }


    public static int[][] randMatrix(int rows, int columns) {
        Random random = new Random();

        int[][] matrix = new int[rows][columns];

        for (int n=0; n<rows; n++)
            for (int m=0; m<columns; m++)
                matrix[n][m] = random.nextInt(199)-99;

        return matrix;
    }
}
