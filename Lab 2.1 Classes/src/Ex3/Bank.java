package Ex3;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Client> clients = new ArrayList<>(); // <> везде заполнять?

    public Bank(String name) {
        this.name = name;
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


    public String getName() {
        return this.name;
    }
}
