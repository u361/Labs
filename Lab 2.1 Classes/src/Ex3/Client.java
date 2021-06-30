package Ex3;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Banknote> banknotes = new ArrayList<>();
    private double money = 0;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addDeposit(Deposit deposit) {
        if (deposits.size() < 5) {
            this.deposits.add(deposit);
        }
        else
            System.out.println("Клиент не может иметь больше 5 депозитов!");
    }

    public ArrayList<Deposit> getDepositsArray() {
        return deposits;
    }

    public void showAllDeposits() {
        for (Deposit deposit : this.deposits) {
            System.out.println("Id: " + deposit.getId() + ", percent: " + deposit.getPercent() + ", period: " + deposit.getPeriod()
                    + ", time left: " + deposit.getTimeLeft() + ", amount: " + deposit.getAmount());
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
