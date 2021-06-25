import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex7 {
    public static void main (String[] Args) {
        System.out.println("Выравнивание текста файла по ширине.");
        int maxLength = 120;

        String string = "";
        try {
            string = Files.readString(Paths.get("text2.txt"));
        }
        catch (IOException error) {
            error.printStackTrace();
        }

        String[] strings = string.replaceAll("\n", " ").split(" ");

        String newString = "";
        int wordsCounter = 0;
        int reqSpacesCounter;

        for (String word: strings) {
            if (newString.length()+word.strip().length()+wordsCounter+1 < maxLength) {
                newString += " " + word.strip();
                wordsCounter++;
            }
            else {
                reqSpacesCounter = maxLength - newString.length() - 1 ;

                int count = 0;

                for (int i=0; i<=newString.length()-1; i++) {
                    if (newString.substring(i, i+1).equals(" "))
                        count++;
                }


               if (reqSpacesCounter>=count && count!=0) {
                    String newSpace = "";
                    for(int i = 0; i<=reqSpacesCounter/count; i++)
                        newSpace += " ";

                    newString = newString.replaceAll(" ", newSpace);
                }
                int div = 0;
                int remain = 0;
                if(count!=0){
                    div = reqSpacesCounter/count;
                    remain = reqSpacesCounter%count;
                }

                newString += " | count: " + count + " req: " + reqSpacesCounter + " div: " + div + " remain: " + remain + "\n";

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(newString);

                boolean spaceAdded = false;
                for(int i = 0; i<stringBuilder.length(); i++) {
                    if (stringBuilder.charAt(i) == ' ' && !spaceAdded && remain>0) {
                        stringBuilder.insert(i, ' ');
                        remain--;
                        spaceAdded = true;
                    }
                    else
                        spaceAdded = false;
                }

                System.out.print(stringBuilder.toString());
                newString = word.strip();
                wordsCounter = 0;
            }
        }
        System.out.print(newString);

    }
}
