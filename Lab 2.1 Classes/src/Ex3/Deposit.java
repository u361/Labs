package Ex3;

public class Deposit {
    private static int lastId = 0;

    private int id;
    private double amount = 10000;
    private double percent;
    private int period;
    private int timeLeft;

    public Deposit(double percent, int period) {
        this.id = ++lastId;
        this.percent = percent;
        this.period = period;
        this.timeLeft = period;
    }

    public int getId() {
        return this.id;
    }

    public double getPercent() {
        return this.percent;
    }

    public int getPeriod() {
        return this.period;
    }

    public int getTimeLeft() {
        return this.timeLeft;
    }

    public double getAmount() {
        return this.amount;
    }

    public void recalculateAmount() {
        if (this.timeLeft == 0) {
            this.amount = amount * ((100 + this.percent) / 100);
            this.timeLeft = this.period - 1;
        }
        else {
            this.timeLeft--;
        }
    }

    public void depositMoney (double amount) {
        this.amount += amount;
    }

    public double withdrawMoney(double amount) {
        this.amount -= amount;
        return amount;
    }
}
