import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Для заданного числа N составьте программу вычисления суммы S=1+1/2+1/3+1/4+…+1/N, где N – натуральное число.");
        System.out.print("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double s = 0;

        for (int i = 1; i <= n; i++) {
            s += 1/i;                              // обязательа точку?
        }

        System.out.println(s);
    }
}
