import java.util.Scanner;

public class Ex4 {
    public static void main(String[] Args) {
        System.out.println("Ввести от пользователя натуральное число и вывести на экран наибольшую десятичную цифру этого числа.");
        System.out.print("Введите натуральное число N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 264353
        int biggest = 0;

        while (n >= 1) {
            if(n%10 > biggest) biggest = n%10;
            n /= 10;
        }

        System.out.println(biggest);
    }
}
