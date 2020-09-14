package service;

import entity.*;

import javax.print.DocFlavor;
import java.util.*;

public final class ClientService {

    // Variables

    private final List<Client> clients;


    // Constructor

    public ClientService() {
        this.clients = new ArrayList<>();
    }

    // Public

    public void addClient(Client client){
        clients.add(client);
    }

    public List<Client> getClientsList() {
        return clients;
    }
    public void deleteClient(Client client) {
        clients.remove(client);
    }

    public void clearClientWishList(Client client) {
        final Client clientByUUID = getClientByUUID(client.getId());
        if(clientByUUID == null)
            throw new RuntimeException("Client not found");
        clientByUUID.getEstateWishList().clear();
    }

    public List<Estate> getClientsWishList(Client client) {
        final Client clientByUUID = getClientByUUID(client.getId());
        if(clientByUUID == null)
            throw new RuntimeException("Client not found");

        return clientByUUID.getEstateWishList();
    }

    public Client getClientByUUID(UUID uuid) {
        return clients
                .stream()
                .filter(client -> client.getId() == uuid)
                .findFirst()
                .get();
    }

    public void addToWishList(Client client, Estate estate) {
        final Client clientByUUID = getClientByUUID(client.getId());

        if(clientByUUID == null)
            throw new RuntimeException("Client not found");

        clientByUUID.getEstateWishList().add(estate);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#############################################");

        for(Client c: clients){
            stringBuilder.append("\nid: ").append(c.getId()).append("\t firstName: ")
                    .append(c.getFirstName()).append("\n lastName: ").append(c.getLastName());
        }

        stringBuilder.append("\n\n#############################################");


        return stringBuilder.toString();
    }
}