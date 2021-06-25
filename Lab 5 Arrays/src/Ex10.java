import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Дана случайная матрица. Найти столбец с наименьшей суммой элементов.");

        int[][] matrix = randMatrix(3, 5);

        for (int[] n : matrix) {
            for (int m : n)
                System.out.print(m + " ");
            System.out.println();
        }

        int sum, minSum=9999, minSumColumn=0;
        for (int m=0; m<matrix[0].length; m++) {
            sum = 0;
            for (int n = 0; n < matrix.length; n++) {
                sum += matrix[n][m];
            }
            if (sum<minSum) {
                minSum = sum;
                minSumColumn = m;
            }
        }

        System.out.println("Минимальная сумма = " + minSum + " в столбце: " + (minSumColumn+1));
    }

    public static int[][] randMatrix (int rows, int columns) {
        Random random = new Random();

        int[][] matrix = new int[rows][columns];

        for (int n=0; n<rows; n++)
            for (int m=0; m<columns; m++)
                matrix[n][m] = random.nextInt(199)-99;

        return matrix;
    }
}
