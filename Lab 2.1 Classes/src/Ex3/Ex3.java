package Ex3;

import java.sql.SQLOutput;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Создать пакет классов, реализующий и тестирующий модель банка, управляющего депозитами.\n");
        /*
        Classes: Modeling(Ex3), Bank, Client, Deposit, Banknote.
         */

        Bank bank = new Bank("Shemyak Financial Group");

        bank.addClient(new Client("Валера"));
        bank.addClient(new Client("Саня"));

        System.out.println("Список клиентов банка " + bank.getName() + ": ");
        bank.showAllClients();



        Client client1 = bank.getClient("Саня");

        for (int i = 1; i <= 5; i++) {
            client1.addDeposit(new Deposit(i, i*100));
        }

        System.out.println("Все депозиты клиента " + client1.getName() + ": ");
        client1.showAllDeposits();

        int days = 500;

        while (days > 0) {
            for (Deposit deposit : client1.getDepositsArray()) {
                deposit.recalculateAmount();
            }
            days--;
        }

        System.out.println();
        client1.showAllDeposits();
    }
}
