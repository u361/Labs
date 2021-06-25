import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Написать программу, убирающую определенный символ в строке,\n" +
                "введенной пользователем. Символ задается константой к программе\n" +
                "(например, «a»). Вывести в консоль то, что осталось от строки после обработки.");
        System.out.print("Ведите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        final String SYMBOL = "a";

        System.out.println(string.replaceAll(SYMBOL, ""));
    }
}
