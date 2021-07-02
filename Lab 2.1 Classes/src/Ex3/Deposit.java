package Ex3;

public class Deposit {
    private static int nextId = 0;

    private int id;
    private double amount = 0;
    private double percent;
    private int period;
    private int timeLeft;

    public Deposit(double percent, int period) {
        this.id = nextId++;
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

    public void depositMoney (String name, double amount) {
        this.amount += amount;
        System.out.println("Депозит с id: " + id + " клиента " + name + " пополнен на " + amount);
    }

    public void withdrawMoney(String name, double amount) {
        if (this.amount < amount) {
            System.out.println("На депозите с id: " + id + " клиента " + name + " недостаточно средств!");
        }
        else {
            this.amount -= amount;
            System.out.println("С депозита с id: " + id + " клиента " + name + " снято " + amount);
        }
    }
}
