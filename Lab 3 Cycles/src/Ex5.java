import java.util.Scanner;

public class Ex5 {
    public static void main (String[] Args) {
        System.out.println("Написать программу вычисления суммы конечного ряда. При разработке программы предусмотреть пропуск слагаемых(множителей), равных нулю или бесконечности. Значение k ввести с клавиатуры.");
        System.out.print("Введите значение k: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        double w = 0;

        for(int i = -2; i <= k; i++) {
            if (2*(i-4) != 0 && Math.pow(-1, i)*factorial(i + 3) != 0)
                w += Math.pow(-1, i)*factorial(i + 3) / (2 * (i - 4));
        }

        System.out.print("W = " + w);
    }

    public static int factorial(int number) {
        int answer = 1;
        for(int i = 1; i <= number; i++)
            answer *= i;
        return answer;
    }
}
