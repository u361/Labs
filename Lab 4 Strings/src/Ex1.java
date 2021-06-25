import java.util.Scanner;

public class Ex1 {
    public static void main (String[] Args) {
        System.out.println("Проверить, начинается ли введенная пользователем строка с символов «Hi!» (без учета регистра). Вывести в консоль «YES» или «NO».");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        if (string.substring(0, 3).equals("Hi!"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
