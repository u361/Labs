import java.util.Scanner;

public class Ex4 {
    public static void main (String[] Args) {
        System.out.println("Подсчитать количество вхождений подстроки в строке. И строка, и подстрока вводятся пользователем.");
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();

        int count = 0;

        for (int i=0; i<=string.length()-substring.length(); i++) {
            if (string.substring(i, i+substring.length()).equals(substring))
                count++;
        }

        System.out.println(count);

    }
}
