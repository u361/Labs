package Ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String name;
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Banknote> banknotes = new ArrayList<>();
    private static int[] denominations = {1, 5, 10, 50, 100, 500, 1000};
    private int reserve;

    public Bank(String name, int[] denominationsCount) {
        this.name = name;
        for (int i = 0; i < denominationsCount.length; i++) {
            for (int j = 0; j < denominationsCount[i]; j++) {
                banknotes.add(new Banknote(denominations[i]));
            }
        }
    }

    public int getReserve() {
        int sum = 0;
        for (Banknote banknote : banknotes) {
            sum += banknote.getDenomination();
        }
        this.reserve = sum;

        return this.reserve;
    }

    public void addBanknote(Banknote banknote) {
        this.banknotes.add(banknote);
    }

    public void deleteBanknote(int denomination) {
        for (int i = 0; i < banknotes.size(); i++) {
            if (banknotes.get(i).getDenomination() == denomination) {
                banknotes.remove(i);
                break;
            }
        }
    }

    public int countBanknotes(int denomination) {
        int count = 0;
        for (Banknote banknote : this.banknotes) {
            if (banknote.getDenomination() == denomination) {
                count++;
            }
        }

        return count;
    }

    public static int[] getDenominations() {
        return denominations;
    }

    public ArrayList<Banknote> getBanknotes() {
        return banknotes;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void showAllClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public Client getClient(String name) {
        Client requestedClient = null;

        for (Client client : this.clients) {
            if (client.getName().equals(name)) {
                requestedClient = client;
            }
        }

            if (requestedClient == null) {
                System.out.println("Клиент с именем " + name + " не найден!");
            }

        return requestedClient;
    }

    public ArrayList<Client> getClientsArray() {
        return this.clients;
    }

    public Client chooseRandomPerson() {
        Random random = new Random();
        return clients.get(random.nextInt(clients.size()));
    }

    public String getName() {
        return this.name;
    }
}
