package Ex1;

public class BitString {
    private long leftPart, rightPart;


    public BitString(long leftPart, long rightPart) {
        this.leftPart = leftPart;
        this.rightPart = rightPart;
    }

    public BitString() {
        this(0L, 0L);
    }

    public void set(long leftPart, long rightPart) {
        this.leftPart = leftPart;
        this.rightPart = rightPart;
    }

    public long getLeftPart() {
        return this.leftPart;
    }

    public long getRightPart() {
        return this.rightPart;
    }

    public BitString and(BitString bitString) {
        return new BitString(this.leftPart & bitString.leftPart, this.rightPart & bitString.rightPart);
    }

    public BitString or(BitString bitString) {
        return new BitString(this.leftPart | bitString.leftPart, this.rightPart | bitString.rightPart);
    }

    public BitString not() {
        return new BitString(~this.leftPart, ~this.rightPart);
    }

    public BitString xor(BitString bitString) {
        return new BitString(this.leftPart ^ bitString.leftPart, this.rightPart ^ bitString.rightPart);
    }

    public void invertBit(long position) {
        if (position >= 64) {
            if (position - 64 == 63) {
                this.leftPart ^= ~(long) Math.pow(2, position - 64);
            }
            else {
                this.leftPart ^= (long) Math.pow(2, position - 64);
            }
        }
        else {
            if (position == 63) {
                this.rightPart ^= ~(long) Math.pow(2, position);
            }
            else {
                this.rightPart ^= (long) Math.pow(2, position);
            }
        }
    }

    public void leftShift(int shift) {
        int realShift = shift % 128;

        if (realShift >= 64) {
            long temp = this.leftPart;
            this.leftPart = this.rightPart;
            this.rightPart = temp;

            realShift -= 64;
        }

        long rightRemainder = (this.rightPart >>> 64 - realShift);
        long newLeftPart = (this.leftPart << realShift);

        long leftRemainder = (this.leftPart >>> 64 - realShift);
        long newRightPart = (this.rightPart << realShift);

        this.rightPart = newRightPart + leftRemainder;
        this.leftPart = newLeftPart + rightRemainder;
    }

    public void rightShift(int shift) {
        int realShift = shift % 128;

        if (realShift >= 64) {
            long temp = this.leftPart;
            this.leftPart = this.rightPart;
            this.rightPart = temp;

            realShift -= 64;
        }

        long rightRemainder = (this.rightPart << 64 - realShift);
        long newLeftPart = (this.leftPart >>> realShift);

        long leftRemainder = (this.leftPart << 64 - realShift);
        long newRightPart = (this.rightPart >>> realShift);

        this.rightPart = newRightPart + leftRemainder;
        this.leftPart = newLeftPart + rightRemainder;
    }

    @Override
    public String toString() {
        String stringLeftPart = String.format("%64s", Long.toBinaryString(this.leftPart)).replace(' ', '0');
        String stringRightPart = String.format("%64s", Long.toBinaryString(this.rightPart)).replace(' ', '0');

        return stringLeftPart + " " + stringRightPart;
    }
}
