package Ex3;

import java.util.Random;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Создать пакет классов, реализующий и тестирующий модель банка, управляющего депозитами.\n");
        /*
        Classes: Modeling(Ex3), Bank, Client, Deposit, Banknote.
         */

        Bank bank = new Bank("Shemyak Financial Group", new int[]{0, 0, 0, 0, 0, 0, 0});

        bank.addClient(new Client("Дедик", bank));
        bank.addClient(new Client("Бина", bank));

        System.out.println("Список клиентов банка " + bank.getName() + ": ");
        bank.showAllClients();
        System.out.println();

        startSimulation(bank, 2000);
    }


    public static void startSimulation(Bank bank, int days) {
        int maxDays = days;
        while (days > 0) {
            //System.out.println("Day: " + days);
            if(days%50 == 0) {
                System.out.println("@Day: " + (maxDays-days));
                Client client = bank.chooseRandomPerson();
                client.randomAction();
                client.showAllDeposits();
                System.out.println("Резерв: " + bank.getReserve());
                System.out.println();
            }

            for (Client client : bank.getClientsArray()) {
                for (Deposit deposit : client.getDepositsArray()) {
                    deposit.recalculateAmount();
                }
            }
            days--;
        }
    }
}
