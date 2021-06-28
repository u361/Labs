import java.util.Random;

public class Ex1 {
    public static void main(String... Args) {
        System.out.println("Реализовать класс для работы с битовыми строками длины 128 бит. Должны быть реализованы\n" +
                "основные поразрядные логические операции со строками (и, или, не, исключающее или).\n" +
                "Также должны быть методы для установки и сброса определенных битов (по номеру бита), методы для\n" +
                "циклического сдвига на определенное количество бит влево и вправо.");

        Random random = new Random();

        BitString bitString1 = new BitString(random.nextLong(), random.nextLong());
        BitString bitString2 = new BitString(random.nextLong(), random.nextLong());

        System.out.println(String.format("%24s", "String 1: ") + bitString1);
        System.out.println(String.format("%24s", "String 2: ") + bitString2);
        System.out.println(String.format("%24s", "And: ") + bitString1.and(bitString2));
        System.out.println(String.format("%24s", "Or: ") + bitString1.or(bitString2));
        System.out.println(String.format("%24s", "Xor: ") + bitString1.xor(bitString2));
        System.out.println();

        System.out.println(String.format("%24s", "String 1: ") + bitString1);
        System.out.println(String.format("%24s", "Not string 1: ") + bitString1.not());
        System.out.println(String.format("%24s", "String 2: ") + bitString2);
        System.out.println(String.format("%24s", "Not string 2: ") + bitString2.not());
        System.out.println();

        System.out.println(String.format("%24s", "String 1: ") + bitString1);
        bitString1.invertBit(63);
        System.out.println(String.format("%24s", "Invert 63 in string 1: ") + bitString1);
        System.out.println(String.format("%24s", "String 2: ") + bitString2);
        bitString2.invertBit(127);
        System.out.println(String.format("%24s", "Invert 127 in string 2: ") + bitString2);
        System.out.println();

        System.out.println(String.format("%24s", "String 1: ") + bitString1);
        bitString1.leftShift(4);
        System.out.println(String.format("%24s", "Left shift 4: ") + "    " + bitString1);
        System.out.println(String.format("%24s", "String 2: ") + "      " + bitString2);
        bitString2.rightShift(6);
        System.out.println(String.format("%24s", "Right shift 6: ") + bitString2);
    }
}
