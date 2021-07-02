package Ex3;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    private static int nextId = 0;
    private int id;
    private String name;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private double money = 0;
    private Bank bank;

    public Client(String name, Bank bank) {
        this.id = nextId++;
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return this.name;
    }

    public void addDeposit(Deposit deposit) {
        if (deposits.size() < 5) {
            this.deposits.add(deposit);
            System.out.println("Депозит клиента " + name + " с id: " + deposit.getId() + " создан.");
        }
        else
            System.out.println("Клиент " + name + " не может создать больше 5 депозитов!");
    }

    public void deleteDeposit(int id) {
        if (this.deposits.size() > id) {
            this.deposits.remove(id);
            System.out.println("Депозит клиента " + name + " с id: " + id + " удален.");
        }
        else
            System.out.println("Депозит клиента " + name + " с id: " + id + " для удаления не найден!");
    }

    public ArrayList<Deposit> getDepositsArray() {
        return deposits;
    }

    public void showAllDeposits() {
        System.out.println("    Депозиты клиента " + this.name + ":");
        if (this.deposits.isEmpty()) {
            System.out.println("        Депозитов нет.");
        }
        else {
            for (Deposit deposit : this.deposits) {
                System.out.println("        Id: " + deposit.getId() + ", percent: " + deposit.getPercent() + ", period: " + deposit.getPeriod()
                        + ", time left: " + deposit.getTimeLeft() + ", amount: " + deposit.getAmount());
            }
        }
    }

    public void withdrawMoney(int amount) {
        if (this.deposits.size() > 0) {
            Random random = new Random();
            int[] denominations = Bank.getDenominations();

            int amountCheck = amount;
            boolean enoughMoney = true;
            for (int i = denominations.length - 1; i >= 0; i--) {
                System.out.println("Остаток: " + amountCheck);
                System.out.println("Номинал купюры: " + denominations[i]);
                System.out.println("    Надо: " + amountCheck / denominations[i]);
                System.out.println("    В банке: " + bank.countBanknotes(denominations[i]));

                if(amountCheck / denominations[i] > bank.countBanknotes(denominations[i])) {
                    enoughMoney = false;
                }
                else {
                    System.out.println("    Достаточно");
                }

                amountCheck %= denominations[i];
            }

            if (enoughMoney) {
                int test = 0;
                int depositId = random.nextInt(deposits.size());
                deposits.get(depositId).withdrawMoney(name, amount);
                for (int i = denominations.length - 1; i >= 0; i--) {
                    while (amount / denominations[i] > 0) {
                        amount -= denominations[i];
                        System.out.println("Удаляем " + denominations[i]);
                        bank.deleteBanknote(denominations[i]);
                        test += denominations[i];
                    }
                }
                System.out.println("Test: " + test);
            }
            else {
                System.out.println("В банке " + bank.getName() + " недостаточно купюр для снятия " + amount + " клиентом " + name);
            }
        }
        else {
            System.out.println("У клиента " + name + " нет депозитов для снятия средств.");
        }
    }

    public void depositMoney(int amount) {
        if (this.deposits.size() > 0) {
            Random random = new Random();
            deposits.get(random.nextInt(deposits.size())).depositMoney(name, amount);

            int[] denominations = Bank.getDenominations();
            for (int i = denominations.length - 1; i >= 0; i--) {
                while (amount / denominations[i] > 0) {
                    amount -= denominations[i];
                    bank.addBanknote(new Banknote(denominations[i]));
                }
            }
        }
        else {
            System.out.println("У клиента " + name + " нет депозитов для зачисления средств.");
        }
    }

    public void randomAction() {
        Random random = new Random();
        switch(random.nextInt(4)) {
            case 0:
                this.addDeposit(new Deposit(random.nextInt(10), (random.nextInt(12)+1)*30));
                break;
            case 1:
                this.deleteDeposit(random.nextInt(5));
                break;
            case 2:
                this.withdrawMoney(random.nextInt(10000));
                break;
            case 3:
                this.depositMoney(random.nextInt(10000));
                break;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
