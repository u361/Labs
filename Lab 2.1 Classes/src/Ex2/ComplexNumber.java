package Ex2;

public class ComplexNumber {
    private double realPart, imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(this.realPart + complexNumber.realPart, this.imaginaryPart + complexNumber.imaginaryPart);
    }

    public ComplexNumber sub(ComplexNumber complexNumber) {
        return new ComplexNumber(this.realPart - complexNumber.realPart, this.imaginaryPart - complexNumber.imaginaryPart);
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        double realPart = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double imaginaryPart = this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber div(ComplexNumber complexNumber) {
        double divider = Math.pow(complexNumber.realPart, 2) + Math.pow(complexNumber.imaginaryPart, 2);

        if (divider == 0) {
            System.err.println("Division by zero!");

            return new ComplexNumber();
        }
        else {
            double dividend = this.realPart * complexNumber.realPart + this.imaginaryPart * complexNumber.imaginaryPart;
            double realPart = dividend / divider;

            dividend = this.imaginaryPart * complexNumber.realPart - this.realPart * complexNumber.imaginaryPart;
            double imaginaryPart = dividend / divider;

            return new ComplexNumber(realPart, imaginaryPart);
        }
    }

    @Override
    public String toString() {
        return this.realPart + " + " + this.imaginaryPart + "i";
    }
}
