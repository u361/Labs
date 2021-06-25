import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Вывести количество каждого символа во введенной пользователем строке и вывести результаты на экран.");
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String controlString = "";
        for (int i = 0; i<string.length(); i++) {
            for (int j = 0; j<string.length(); j++) {
                if (string.substring(i, i+1).equals(string.substring(j, j+1))) {
                    if (!controlString.contains(string.substring(i, i+1))) {
                        controlString = controlString.concat(string.substring(i, i + 1));
                    }
                }
            }
        }

        for (int i = 0; i<controlString.length(); i++) {
            int count = 0;

            for (int j = 0; j<string.length(); j++) {
                if (controlString.substring(i, i+1).equals(string.substring(j, j+1)))
                    count++;
            }
            System.out.println(controlString.substring(i, i+1) + count);
        }
    }
}

