import TreeSortPackage.TreeSort;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Testing {
    public static void main(String[] args) {
        System.out.println("1 - StupidSort, 2 - BubbleSort, 3 - ShakerSort, 4 - InsertionSort, 5 - SelectionSort\n" +
                "6 - MergeSort, 7 - QuickSort, 8 - CountSort, 9 - RadixSort, 10 - TreeSort.TreeSort, 12 - ArraysSort");

        System.out.print("Выберете тип сортировки: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.print("Введите количество элементов: ");
        int length = scanner.nextInt();

        int[] array = randArray(length);
        int[] sortedArray = new int[length];

        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();

        switch (choice) {
            case (1):
                sortedArray = StupidSort.sort(array);
                break;
            case (2):
                sortedArray = BubbleSort.sort(array);
                break;
            case (3):
                sortedArray = ShakerSort.sort(array);
                break;
            case (4):
                sortedArray = InsertionSort.sort(array);
                break;
            case (5):
                sortedArray = SelectionSort.sort(array);
                break;
            case (6):
                sortedArray = MergeSort.sort(array);
                break;
            case (7):
                sortedArray = QuickSort.sort(array);
                break;
            case (8):
                sortedArray = CountSort.sort(array);
                break;
            case (9):
                sortedArray = RadixSort.sort(array);
                break;
            case (10):
                sortedArray = TreeSortPackage.TreeSort.sort(array);
                break;
            case (12):
                sortedArray = ArraysSort.sort(array);
                break;
        }

        long endTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Отсортировано " + array.length + " элементов за " + (endTime-startTime) + " мс.");
    }


    public static int[] randArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++)
            array[i] = random.nextInt(199) - 99;

        return array;
    }
}
