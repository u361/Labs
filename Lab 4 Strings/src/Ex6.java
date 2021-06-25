import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Просуммировать все ЧИСЛА в тексте, взятом из файла.");

        String string = "";
        try {
            string = Files.readString(Paths.get("text.txt"));
        }
        catch (IOException error) {
            error.printStackTrace();;
        }

        int sum = 0;
        String number = "";
        boolean numberAddedToSum = false;

        for (char character : string.toCharArray()) {
            if (Character.isDigit(character)) {
                number = number.concat(Character.toString(character));
                numberAddedToSum = false;
            }
            else
                if (!number.equals("")) {
                    sum += Integer.parseInt(number);
                    numberAddedToSum = true;
                    number = "";
                }
        }
        if (!numberAddedToSum)
            sum += Integer.parseInt(number);

        System.out.println(sum);

    }
}
