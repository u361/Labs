import java.util.Arrays;
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Дана квадратная случайная матрица. Зеркально отразить ее элементы относительно побочной диагонали. Вывести результат на экран.");

    int[][] squareMatrix = squareRandMatrix(3), newMatrix = new int[squareMatrix.length][squareMatrix[0].length];


    for (int[] i : squareMatrix)
        System.out.println(Arrays.toString(i));

    for (int n=0; n<squareMatrix.length; n++)
        for (int m=0; m<squareMatrix[n].length; m++)
            newMatrix[m][n]=squareMatrix[n][m];

    System.out.println();

    for (int[] i : newMatrix)
            System.out.println(Arrays.toString(i));
    }


    public static int[][] squareRandMatrix(int size) {
        Random random = new Random();

        int[][] matrix = new int[size][size];

        for (int n=0; n<size; n++)
            for (int m=0; m<size; m++)
                matrix[n][m] = random.nextInt(199)-99;

            return matrix;
    }

}
