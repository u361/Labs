import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex5 {
    public static void main (String[] Args) {
        System.out.println("Просуммировать все ЦИФРЫ в тексте, взятом из файла.");

        String string = "";

        try {
            string = Files.readString(Paths.get("text.txt"));
        }
        catch (IOException error) {
            error.printStackTrace();
        }

        int sum = 0;

        for (char character : string.toCharArray())
            if (Character.isDigit(character))
                sum += Character.getNumericValue(character);

        System.out.println(sum);
    }
}
