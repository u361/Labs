import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Дана случайная матрица. Определить среднее арифметическое каждого столбца,\n" +
                "определить максимум и минимум каждой строки. ");

        int[][] matrix = randMatrix(3, 5);

        for (int[] i: matrix)
         System.out.println(Arrays.toString(i));

        int sum;

        for (int i=0; i<matrix[0].length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++)
                sum+=matrix[j][i];
            System.out.print(" " + (double)sum/matrix.length);
        }

        System.out.println();

        int max, min;

        for (int i=0; i<matrix.length; i++) {
            max = -99;
            min = 99;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]<min)
                    min = matrix[i][j];
                if (matrix[i][j]>max)
                    max = matrix[i][j];
            }
            System.out.println("Min: " + min + " Max: " + max + "; ");
        }

    }


    public static int[][] randMatrix(int rows, int columns) {
        Random random = new Random();

        int[][] matrix = new int[rows][columns];

        for (int i=0; i<rows; i++)
            for (int j=0; j<columns;j++)
                matrix[i][j] = random.nextInt(199)-99;

        return matrix;
    }

}
