import java.util.Scanner;

public class Ex2 {
    public static void main(String[] Args) {
        System.out.println("Получить в порядке убывания все делители данного числа.");
        System.out.print("Введите число : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i>0; i--) {
            if (number%i == 0)
                System.out.println(i);
        }
    }
}
