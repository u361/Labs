package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Реализовать класс для работы с комплексными числами, имеющий конструктор\n" +
                "по умолчанию и конструктор с параметрами, а также методы для выполнения четырех\n" +
                "основных арифметических операций. Каждый арифметический метод должен возвращать\n" +
                "новый экземпляр объекта комплексного числа для возможности построения конвейера вызовов.");

        ComplexNumber complexNumber1 = new ComplexNumber(3, 7);
        ComplexNumber complexNumber2 = new ComplexNumber(2, 4);
        ComplexNumber complexNumber3 = new ComplexNumber();

        System.out.println("Complex number 1: " + complexNumber1);
        System.out.println("Complex number 2: " + complexNumber2);
        System.out.println("Complex number 3: " + complexNumber3);
        System.out.println("Add 1 and 2: " + complexNumber1.add(complexNumber2));
        System.out.println("Sub 1 and 2: " + complexNumber1.sub(complexNumber2));
        System.out.println("Mul 1 and 2: " + complexNumber1.mul(complexNumber2));
        System.out.println("Div 1 and 2: " + complexNumber1.div(complexNumber2));
        System.out.println("Div 1 and 3: " + complexNumber1.div(complexNumber3));

    }
}
