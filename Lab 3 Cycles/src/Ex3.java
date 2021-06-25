import java.util.Scanner;

public class Ex3 {
    public static void main (String[] Args) {
        System.out.println("Для заданного n в одном цикле вычислить n! и 2^n.");
        System.out.print("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int factorial = 1, power = 1;

        for (int i = 1; i<=n; i++) {
            factorial *= i;
            power *= 2;
        }

        System.out.print("n! = " + factorial + "; 2^n = " + power);
    }
}
